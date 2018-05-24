using System;
using System.Collections.Generic;


namespace QueryProcessing
{
    public interface IOperator
    {
        void Open();
        RowRecord Next();
        void Close();
    }

    public class RowRecord
    {
        private List<KeyValuePair<String, long>> content { get; set; }

        public RowRecord()
        {
            this.content = new List<KeyValuePair<string, long>>();
        }

        public void Put(String columnKey, long columnValue)
        {
            this.content.Add(new KeyValuePair<string, long>(columnKey, columnValue));
        }

        public void PutAll(RowRecord item)
        {
            this.content.AddRange(item.content);
        }

        public long? Get(String columnKey)
        {
            foreach (KeyValuePair<String, long> item in this.content)
            {
                if (item.Key == columnKey)
                {
                    return item.Value;
                }
            }

            return null;
        }

    }

    public class HashJoin : IOperator
    {
        private IOperator leftInput;
        private IOperator rightInput;
        private string leftKey;
        private string rightKey;
        private Dictionary<long, RowRecord> hashTable;

        public HashJoin(IOperator leftInput, IOperator rightInput, string leftKey, string rightKey)
        {
            this.leftInput = leftInput;
            this.rightInput = rightInput;
            this.leftKey = leftKey;
            this.rightKey = rightKey;
        }

        public void Open()
        {
            return;
        }

        public void Close()
        {
            this.hashTable = null; 
        }

        public RowRecord Next()
        {
            if (this.hashTable == null)
            {
                this.hashTable = new Dictionary<long, RowRecord>();

                RowRecord row = this.leftInput.Next();
                while (row != null)
                {
                    this.hashTable.Add( (long) row.Get(this.leftKey), row);
                    row = this.leftInput.Next();
                }
            }

            RowRecord match = null;
            while (match == null)
            {
                RowRecord nextRight = this.rightInput.Next();
                if (nextRight == null)
                {
                    break;
                }

                if (this.hashTable.ContainsKey((long) nextRight.Get(this.rightKey)))
                {
                    RowRecord matchRow = this.hashTable[(long) nextRight.Get(this.rightKey)];
                    // Inner join implementation returns only matched rows
                    // Format: leftJoinKeY | leftValue | rightJoinKey | rightValue
                    match.PutAll(matchRow);
                    match.PutAll(nextRight);
                    return match;
                }

            }

            this.Close();
            return null;
        }
    }


    public class Average : IOperator
    {
        private IOperator input;
        private string inputKey;
        private long sum;
        private long count;

        public Average(IOperator input, string inputKey)
        {
            this.input = input;
            this.inputKey = inputKey;
        }

        public void Open()
        {
            this.sum = 0;
            this.count = 0;
        }

        public void Close()
        {
            return;
        }

        public RowRecord Next()
        {
            RowRecord result = new RowRecord();

            RowRecord nextRow = this.input.Next();
            while (nextRow != null)
            {
                this.sum += (long) nextRow.Get(this.inputKey);
                this.count++;
                nextRow = this.input.Next();
            }

            // If this.count equals to 0, NULL is returned for SUM/AVG
            if (this.count != 0)
            {
                result.Put("AVG", this.sum / this.count);
                return result;
            }
            else
            {
                this.Close();
                return null;
            }
        }
    }
}

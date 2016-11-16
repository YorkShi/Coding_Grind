/**
 * Created by 13104584d on 16/11/2016.
 */
public class BloomFilter {
    private String[] lines;
    private int size;
    private int [] result;
    private int hashCount;

    public static void main(String [] args){
        String [] lines = {"bug", "straw", "megabyte", "compilation", "video", "socialist", "radius", "appreciation", "chestnut"};
        BloomFilter test = new BloomFilter(lines, 23,2);
        test.add();
        test.lookUp("China");
    }

    public BloomFilter(String[] lines, int size, int hashCount){
        this.lines = lines;
        this.hashCount = hashCount;
        this.size = size;
        this.result = new int [size];
        for (int i = 0; i < size; i++){
            result[i] = 0;
        }

    }

    public void add(){
        //result = new int [hashCount];
        double result1;
        double result2;
        for(int i = 0; i < this.lines.length; i++){
            result1 = this.hash(lines[i], 1);
            result2 = this.hash(lines[i], 2);
            //System.out.println(result1);
            //System.out.println(result2);
            result[(int) result1 - 1] = 1;
            result[(int) result2 - 1] = 1;

            System.out.println(lines[i]);
            for (int j = 0; j < this.size; j++)
                System.out.print(result[j]);
            System.out.println();
        }
    }

    public double hash(String string, int hashcount){
        double temp = 0;
       // int temp2 = 0;
        for(int i = 0; i < string.length(); i++) {
            temp += ((double) string.charAt(i) - 96) * Math.pow(3, hashcount + i + 1);
            //System.out.println(temp);
        }

        return (temp % this.size);
    }


    public void lookUp(String string){
        double result1 = this.hash(string,1);
        double result2 = this.hash(string,2);
        System.out.println((this.result[(int) result1 - 1 ] == 1 && this.result[(int) result2 - 1] == 1) ? true:false);
    }
}

import math

class BloomFilter:
    ##lines = ["bug", "straw", "megabyte", "compilation", "video", "socialist", "radius", "appreciation", "chestnut"]

    def __init__(self, size, hash_count):
        self.size = size
        self.hash_count = hash_count
        self.bit_array = [0 for i in range(size)]

    def add(self):
        lines = ["bug", "straw", "megabyte", "compilation", "video", "socialist", "radius", "appreciation", "chestnut"]
        print(self.bit_array)
        for line in lines:
            result1 = self.hash(line, 1)
            result2 = self.hash(line, 2)
            self.bit_array[result1-1] = 1
            self.bit_array[result2-1] = 1
            print(line,result1,result2)
            print(self.bit_array)

    def hash(self, string, hashCount):
        temp = 0
        for i in range(len(string)):
            temp2 = self.stringorder(string[i]) * math.pow(3,hashCount + i + 1);
            temp = temp + temp2
        ##print(temp)
        return int(math.fmod(temp, self.size))


    @staticmethod
    def stringorder(bit):
            return ord(bit) - 96

    def lookup(self, string):
        result1 = self.hash(string, 1)
        result2 = self.hash(string, 2)
        print(result1)
        print(result2)
        if self.bit_array[result1-1] == 1 and self.bit_array[result2-1] == 1:
            return "Probably"
        return "Nope"


test = BloomFilter(23,2)

test.add()

print(test.lookup("newyork"))


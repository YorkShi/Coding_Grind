import math

class BloomFilter:
    lines = ["bug", "straw", "megabyte", "compilation", "video", "socialist", "radius", "appreciation", "chestnut"]

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
            self.bit_array[result1] = 1
            self.bit_array[result2] = 1
            print(self.bit_array)

    def hash(self, string, hashCount):
        temp = 0
        for i in range(len(string)):
            temp2 = math.pow(self.stringorder(string[i]),hashCount + i);
            temp = temp + temp2
        ##print(temp)
        return int(math.fmod(temp, self.size))


    @staticmethod
    def stringorder(bit):
        if bit == "a":
            return 1
        elif bit == "b":
            return 2
        elif bit == "c":
            return 3
        elif bit == "d":
            return 4
        elif bit == "e":
            return 5
        elif bit == "f":
            return 6
        elif bit == "g":
            return 7
        elif bit == "h":
            return 8
        elif bit == "i":
            return 9
        elif bit == "j":
            return 10
        elif bit == "k":
            return 11
        elif bit == "l":
            return 12
        elif bit == "m":
            return 13
        elif bit == "n":
            return 14
        elif bit == "o":
            return 15
        elif bit == "p":
            return 16
        elif bit == "q":
            return 17
        elif bit == "r":
            return 18
        elif bit == "s":
            return 19
        elif bit == "t":
            return 20
        elif bit == "u":
            return 21
        elif bit == "v":
            return 22
        elif bit == "w":
            return 23
        elif bit == "x":
            return 24
        elif bit == "y":
            return 25
        elif bit == "z":
            return 26

    def lookup(self, string):
        result1 = self.hash(string, 1)
        result2 = self.hash(string, 2)
        if self.bit_array[result1] == 0 or self.bit_array[result2] == 0:
            return "Nope"
        return "Probably"


test = BloomFilter(23,2)

test.add()

test.lookup("xda")


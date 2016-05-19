import math

def main():
    
    x = 1

    for i in range(8):
        x = math.sqrt(2+x)
        i = i +1

    x = 768*math.sqrt(2-x)

    print("The estimated pi is: {0:0.30f}.".format(x))
    print("The actual pi is: {0:0.30f}.".format(math.pi))

main()
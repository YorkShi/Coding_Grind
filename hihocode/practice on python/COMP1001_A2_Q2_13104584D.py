def main():
    n = eval(input("Please enter the number of piles of rocks >> "))
        rock = [] # create an empty list
        # get the positions of the n piles
        for i in range(n):
            x = eval(input("Enter the section number (>0) for the "+str(i+1)+"th pile >>"))
                rock.append(x) # append a new number to the list
    
        list2 = sorted(map(int, rock))[0:len(rock)]
        a = int(sum(list2)/len(rock))
        print("the specific pile in which all the rocks should be placed into is:"+str(a)+"th pile >>")
main()


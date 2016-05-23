def func(min,max):
      list1 = [max]
      list2 = [min]
      if min>=max:
            raise ValueError("The min must not be greater than the max")
      if type(min) != int and type(max) != int:
            raise TypeError("The min and max must be of type of int")

      return max-min


def main():
      list = [[10,20],[20,10],[10],[],['a','b'],['a']]
      
      for i in range(len(list)):
                  try:
                        if len(list[i]) == 2:
                              func(list[i][0],list[i][1])
                              print("The result for func("+str(list[i][0])+','+str(list[i][1])+") is: "+str(func(list[i][0],list[i][1])))
                        else:
                               func(list[i])
                  except ValueError as message:
                        print("The result for func("+str(list[i][0])+','+str(list[i][1])+") is: "+str(message))

                  except TypeError as message:
                        if len(list[i]) == 2:
                              print("The result for func("+str(list[i][0])+','+str(list[i][1])+") is: "+str(message))
                        elif len(list[i]) == 1:
                              print("The result for func("+str(list[i])+") is: "+str(message))
                        elif len(list[i]) == 0:
                              print("The result for func() is: "+"func() missing 2 required positional argument: 'max' and 'min'")

                  
            
main()

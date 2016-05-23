def Fib(a,b):

    if b % 2 == 0:
        if b/2<a:
            
            return int(b - a), '('*(b - a)+'X'+'+1)'*(b-a)
        
        if b/2>a:
            
            m,n = Fib(a,int(b/2))
            return m + 1,  '('+n+'*2)'
        else:
            
            return 1,'(x*2)'
        
    elif b % 2 == 1:
        if (b - 1) / 2 < a:
            
            return int(b - a), '('*(b-a)+'X'+'+1)'*(b-a)
            
        elif (b - 1) / 2 >=a:
            
            m , n = Fib(a,b-1)
            return m + 1, '('+n+'+1)'
            

def main():
    
    x,y = eval(input('Please enter two positive integers seperated by comma,in which  X < Y, :'))
    
    m, n = Fib(x,y)
    
    print('The minium number of operations to needed is',m)
    
    print('The operations needed are showed as followed:\n','Y = ',n)

          


main()



def findSecretLocation(x1,x2,y1,y2):
    print(x1,x2,y1,y2)
    if test(x1,x2,y1,y2):
        
        if x1 == x2 and y1 == y2:
            print("debug")
            return x1,y1;
        elif x1 != x2 or y1 != y2:

            a1 = findSecretLocation(x1,(x1+x2)//2, y1,(y1+y2)//2)
            a2 = findSecretLocation(x1,(x1+x2)//2, (y1+y2)//2+1, y2)
            a3 = findSecretLocation((x1+x2)//2+1, x2, y1,(y1+y2)//2)
            a4 = findSecretLocation((x1+x2)//2+1, x2, (y1+y2)//2+1, y2)
            
        else:
            return (-1, -1)
def test(a1, a2, b1, b2):
    if a1 <= 3 <= a2:
        if b1 <= 5 <= b2:
            return True;
    else:
        return False;

def main():
    a = findSecretLocation(1,10,1,10)
    print(a)
          
main()

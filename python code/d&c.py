def findSecretLocation(x1,x2,y1,y2):
    print(x1,x2,y1,y2)
    if test(x1,x2,y1,y2):
        
        if x1 == x2 and y1 == y2:
            print("debug")
            return x1,y1;
        else:
            findSecretLocation(x1,(x1+x2)//2, y1,(y1+y2)//2)
            findSecretLocation(x1,(x1+x2)//2, (y1+y2)//2+1, y2)
            findSecretLocation((x1+x2)//2+1, x2, y1,(y1+y2)//2)
            findSecretLocation((x1+x2)//2+1, x2, (y1+y2)//2+1, y2)

def test(a1,a2,b1,b2):
    if a1 <= 3 and 3 <= a2:
        if b1 <= 5 and 5 <= b2:
            return True;
    else:
        return False;

def main():
    a = findSecretLocation(1,3,4,5)
    print(a)
          
main()

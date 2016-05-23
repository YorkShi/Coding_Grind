import copy


def subTable(a,b,i):
    subTable = []
    for j in range(a):
        n = '%02d'%(i + j)
        subTable.append(n)
    return subTable


def Table(a,b):
    table = []
    for i in range(a):
        table.append(subTable(a,b,i))
    return table
    

def main():
    a , b = 10,10
    result = Table(a,b)
    for i in range (b):
        print(result[i])

main()

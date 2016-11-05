def firstWin(x):
    n = len(x)
    largest = [0 for i in range(n)]
    sum = [0 for i in range(n)]

    for i in range(1,n):
        sum[i] = sum[i-1] + x[i-1]

    for i in range(n):
        largest[i] = x[i]

    temp = 0
    for i in range(1,n):
        temp = largest[n-i]
        for j in range(n-i-1,0):
            temp2 = largest[j]
            largest[i] = max(x[j] + sum[i + j +1] - sum[i-1]- temp, x[i+j] + sum[i + j] - sum[i] - largest[i])
            temp = temp2

    return largest


def main():
    print(firstWin([2, 3, 4]))

main()

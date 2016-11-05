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
        for j in range(n-1):
            largest[i][j] = max(x[j] + sum[i][j-1] - largest[i][j-1], x[i] + sum[i+1][j] - largest[i + 1][j])

    return largest


def main():
    print(firstWin([2, 3, 4]))

main()

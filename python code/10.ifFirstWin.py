def firstWin(x):
    n = len(x)
    largest = [[0 for i in range(n)] for j in range(n)]
    sum = [[0 for i in range(n)] for j in range(n)]

    for i in range(n):
        sum[i][i] = x[i]

    for i in range(n):
        for j in range(n):
            if i < j:
                sum[i][j] = sum[i][j-1] + x[j]

    for i in range(n):
        largest[i] = x[i]

    for i in range(n-1):
        for j in range(n-1):
            largest[i][j] = max(x[j] + sum[i][j-1] - largest[i][j-1], x[i] + sum[i+1][j] - largest[i + 1][j])

    return largest


def main():
    print(firstWin([2, 3, 4]))

main()

## The two-stack game can look in two different ways. Either the two heaps are equal in size or unequal in size
## For game with equal-size stacks, the one who choose to move secondly will win
## For game with uneuqal-size stacks, the first player will always win in his/her manifest destiny if the following strategy is followed.
## Since all his/her moves could be mirrored by the other opponent, in this case the player on this turn with equal-size stacks is in a losing position, , eventually giving his/her opponent the last move.

def main():

M = input("please input the number of the Stack One of coins:")
N = input("please input the number of the Stack Two of coins:")
order = input("please choose to play firstly or secondly (1/2):")

while order is equal to 1:

    if M is larger than to N :
        a = input("The first player will always win the game")
        b = input("First player pick"+ M-N + "of coin(s) in stack M:")
        M = N

    else:
        ## N is larger than to M :
        a = input("The first player will always win the game")
        b = input("First player pick"+ N-M + "of coin(s) in stack N:")
        M = N

while order is equal to 2 or M = N:
        ## M is equal to N:

        print("The player who is not on this turn will always win the game")

        for m not equals to 0 and n not equals to 0:
        c = input("the plyer on this turn pick coins: ")
        d = input("The second plyer will pick"+c+"coins")
        M = M - c
        N = N - c
        ## in this loop, the player who pick secondly at the beginning will always picks the last coin(s)












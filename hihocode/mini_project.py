from graphics import *

def setUp(dx, dy):
    ##Construction of the window
    winWidth = 700
    winHeight = 700
    win = GraphWin('Bouncing Ball Game', winWidth, winHeight)
    
    radius = 50

    center = win.getMouse()
    ball = Circle(center, radius)
    
    ##Yeah we want a red ball indeed!
    ball.setFill("red")
    ball.draw(win)
    
    ##Call the moving function to realize the movement of ball
    moving(ball, dx, dy, radius)
    
    ##Program terminated
    win.close()

def moving(ball, dx, dy, radius):
    
    ##This 'time' actually represents the how many times the moving loop loops. 
    time = eval(input("Please input the time you want the ball to bounce(100-):"))
    ## Exception handling
    if time < 100:
                  raise ValueError("The mininum time should be at least 100")

    for i in range(time):
        
        ## Every time the loop is called, the ball would move one time first
        ball.move(dx, dy)
        center = ball.getCenter()

        ## Acquire the coordinate of the center of the ball
        x = center.getX()
        y = center.getY()
        
        ## if the ball touched the wall, convert dx or dy into negative sign
        if x < 50:
            dx = -dx
        elif x > 650:
            dx = -dx
        if y < 50:
            dy = -dy
        elif y > 650:
            dy = -dy            

def main():
    ballSpeed = eval(input("Please input the moving speed of ball (0-100):"))
    ## Exception handling
    if ballSpeed < 0 or ballSpeed > 100:
                  raise ValueError("The input must be between 0 and 100, inclusive.")
    
    ballDir = eval(input("Please input an decimal as the slope of first moving direction of ball(0-1):"))
    ## Exception handling
    if ballDir < 0 or ballDir > 1:
                  raise ValueError("The input must be between 0 and 1, inclusive.")
    
    print("Your may click to initialize the initial position of the ball now!")
    
    ## dx, dy represents the specific movement for ball to move once! 
    dx = ballDir*ballSpeed
    dy = (1-ballDir)*ballSpeed
    setUp(dx, dy)

main()

Student Name: SHI Yuanjing
Student id: 13104584d
Topic: B. Bouncing balls

Problem:
Generate a window with at least a ball bouncing against the four walls
continuously. The user could specify the initial position of the ball, the first direction of moving, the speed, and so on.
 
Program Design & Structure:
 
1. With the aim to specify the OOP principle of Python, this program is divided into three main functions, including setUp, moving and main.

2. main (Function):
In this function, the program would be executed while user would be asking to input the moving speed, with a range of 0 - 100, and a decimal for ball moving direction, with a range of 0-1 inclusively.

3. setUp (Function):
Receiving the parameters from 'main', 'setUp' firstly set up an graphic window with both width and height of 700. Then initialise a red ball with a radius of 50. Last but not least, the moving function would be called to realise the movement of this ball. After this, the window would be closed consequently.

4. moving (Function):
Receiving the parameters from ‘setUp’ (ball, dx, dy, radius), 'moving' would let user to input the duration for ball bouncing game. Then a for-loop is constructed to achieve the moving of ball. 

Within one loop, a ball would just move for dx (units) on width and dy (units) on height for one time. Once ball touches the wall, dx or dy would just be converted to be -dx or -dy. Therefore the ball would continuously moving in a reverse symmetric direction until the time is up.

5. Exception handling:
Exception may occur in these three following occasions:

1. Input of speed is smaller than 0 or larger than 100:
In this case, a ValueError would be raised to remind user that speed of ball should between 0 and 100.

2. Input of direction parameter is smaller than 0 or larger than 1:
In this case, a ValueError would be raised to remind user that direction parameter of ball should between 0 and 100.

3. Input of time is smaller than 100:
In this case, a ValueError would be raised to remind user that speed of ball should be at least larger than 100.   
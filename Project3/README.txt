   _____  ____  _    _ _____ _____   _____          __  __ ______  _____ 
  / ____|/ __ \| |  | |_   _|  __ \ / ____|   /\   |  \/  |  ____|/ ____|
 | (___ | |  | | |  | | | | | |  | | |  __   /  \  | \  / | |__  | (___  
  \___ \| |  | | |  | | | | | |  | | | |_ | / /\ \ | |\/| |  __|  \___ \ 
  ____) | |__| | |__| |_| |_| |__| | |__| |/ ____ \| |  | | |____ ____) |
 |_____/ \___\_\\____/|_____|_____/ \_____/_/    \_\_|  |_|______|_____/ 
                                                                         
Front Man: Greg Walsh
PROJECT 3 - SPRING 2022 - P&PS1
EMAIL ME WHAT VERSION YOU WOULD LIKE AND I WILL ADD YOU TO A PRIVATE REPO 

Task: Create a version of Episode 7 of Squid Games on Netflix.
More information can be found here:
https://www.vulture.com/article/squid-game-season-1-episode-7-vips.html
https://www.netflix.com/watch/81262757?source=35

GAME RECAP:
https://www.youtube.com/watch?v=0DdmFYpqD4U

WriteUp:
There are 2 ladders R and L 
There are 2 types of Glass, Regular and Tempered 
Tempered Glass can hold your body weight
Regular Glass can not hold your body weight
 
NOTE: IF YOU PICK THE EAST MODE THE HIGHEST LETTER GRADE YOU CAN GET IS B
      IF YOU PICK THE HARD MODE THE HIGHEST LETTER GRADE YOU CAN GET IS A
EASY MODE - I give you boiler plate code and you need to follow instructions to create the code
HARD MODE - You are on your own other than this README to design the game how you wish
 

TO RUN THE JAVA JAR IN YOUR TERMINAL WITHIN THIS FOLDER type:

java -jar SquidGame.jar

NOTE: YOU MUST MAKE SURE YOU ARE IN THE PROJECT3 FOLDER


The Requirements of this project is to create the ladder game in an asci art 
EX.
|||||| ---- Start
| || |
| || |
| || |
| || |
| || |
| || |
| || |
| || |
|||||| ---- Finish

This ladder should be dynamic in that as the player continues to play the game the ladder updates
EX.
|||||| ---- Start
|1||0|
|1||0|
|?||?|

You can follow this legend to help with the glass vs tempered glass
---------LEGEND-----------
0: Glass
1: Tempered Glass
--------------------------

The game will continue until the player runs out of lives or makes it to the end:


WIN EX.
Congrats You Won!!
|||||| ---- Start
|1||0|
|1||0|
|1||0|
|1||0|
|0||1|
|1||0|
|0||1|
|0||1|
|||||| ---- Finish


LOSE EX.
-------------------------------------
|||||| ---- Start
|1||0|
|1||0|
|?||?|
You Lost 1 life
Total Lives: 0
YOU DIED

Components:
The hardest part of the game will be making the ladder dynamic
The best approach is to break up each of your objectives:
1. Create a player life counter with the following methods:
    a) getLives - Get total lives
    b) death - Subtract 1 from total lives
2. Create a ladder with n panels
    Hint1: This can be done with a 2D array with the rows as the panels & 2 cols R/L
    Hint2: The Cols are going to be hard coded 2 so int[panels][2] would work
    Hint3: To create the ladders Glass and Tempered Glass placements use a double for loop 
    Hint3: If you are really stuck here (I was for a few hours) Email me
    Hint4: in the double for loop make a random number generator 0-1 
3. Create a printer for a answer ladder and blank ladder and current ladder
    a) Have a hard coded Start and End 
    b) the ladder should be the length that was decided by the objects initialization
    Hint: Current Ladder -This is helpful- "|"+ladder[i][j] + "|" 
4. Create a method to get the current user selection
    a) answer should only be R,r or L,l anything else should reprompt the user
    b) conver R to 1 and L to 0 
    c) add that value to an ArrayList
5. Now you have a 2D array of the answers of panels and an running arrayList of the user
selections... compare the current index of the users selection with the answer array 
if correct continue to next ladder row and print the current ladder incermented by 1 
if wrong -1 from lives
if the lives hit 0 then end the game
if the lives are not 0 and the end of the ladder is reached then print the final 
ladder as well as a congrats 

# NumberGuessingGame
Number Guessing Game utilizing Java in which the user has to correctly guess the number generated by the computer.
## Motivation
I built this program in order to practice my Java skills I obtained through my coursework. Through this project, I was able to learn more about different variable types,
conditional statements, for and wwhile loops, and the importance of importing modules to use certain methods within Java.
## Language
This program was entirely written in Java.
## Build Status
This project for Java was a beginner project in which I was getting comfortable with the syntax heavy language. In the future, I would like to develop further with
utilizing more classes and building more using OOP.
## Psuedocode template
Below was the pseudocode template I used broadly to write the program:
    Variable containing computer generated integer (CGI).

    PRINT Welcoming statement.

    Variable containing number of guesses.

    Main Program Loop (MPL) variable whether to stay in loop or exit and terminate program.

    Main program while loop while MPL variable is true and number of guesses is less than 4.

     PRINT Select integer between 1 and 20.

     Receive input of user chosen integer (UCI)

      IF chosen integer is between 1 and 20

            IF UCI == CGI
               PRINT Congratulations statement
               BREAK out of loop

            ELSE IF UCI is less than CGI
               PRINT User guess is lower than computer chosen number.
               Add 1 to variable containing number of guesses.
               CONTINUE to the top of while loop

            ELSE IF UCI is greater than CGI
               PRINT User guess is higher than computer chosen number.
               Add 1 to variable containing number of guesses.
               CONTINUE to the top of while loop.

       ELSE (UCI is not between 1 and 20.)
            CONTINUE to the top of while loop.

    IF variable containing number of guesses is equal to 4
       PRINT User has used all 4 of their guesses.
       PRINT CGI to the user
       PRINT Closing Statement.

## Test Scenarios
Below are some example scenarios that could come about during the program:
Scenario 1: User correctly guesses the number on the very first guess.
1.	The program begins by greeting the user to the number guessing game.
2.	The program then asks the user to guess a number between 1 and 20.
3.	The user inputs a number.
4.	User inputted number matches computer generated number.
5.	The program tells the user that they have successfully guessed the number.
6.	The program thanks the user for playing, and the program ends. 

Scenario 2: User guesses on final guess through a combination of higher and lower guesses.
1.	The program begins by greeting the user to the number guessing game.
2.	The program then asks the user to guess a number between 1 and 20.
3.	The user inputs a number that is higher or lower than the generated number.
4.	The program lets the user know that their guess is higher or lower than the generated number.
5.	The user is then allotted 3 more chances to guess the correct number.
6.	Upon guessing on the final chance (4 chances total), the program tells the user that they have successfully guessed the number.
7.	The program thanks the user for playing, and the program ends.

Scenario 3: User runs out of guess.
1.	The program begins by greeting the user to the number guessing game.
2.	The program then asks the user to guess a number between 1 and 20.
3.	The user inputs a number that is higher or lower than the generated number.
4.	The program lets the user know that their guess is higher or lower than the generated number.
5.	The user is then allotted 3 more chances to guess the correct number.
6.	Upon using their last guess (4 total), the program explains to the user that they have used up their 4 guesses.
7.	The program tells the user the randomly generated number.
8.	The program thanks the user for playing, and the program ends.

##Debugging Issues
The first initial problem I was running into was the fact that I wanted the game to end after a certain amount of turns,
and issue out a prompt to the user stating that they reached the max amount of guesses and to tell them what the number was.
Each time the max amount of guesses (4) was reached however, the program would simply end, without the prompt being read out. Here was the initial code laid out: 

![image](https://user-images.githubusercontent.com/104124602/221640531-57477f1c-c0c4-4f3e-9d86-9665287658ab.png)

With the console outputting the following:

![image](https://user-images.githubusercontent.com/104124602/221640607-3ab64977-2024-4179-b174-8c261083d573.png)

What solved the issue was changing two parts: updating the while loop to have correct bounds; and adding an extra if statement towards the end to signal if the count (guesses) reached the upper limit.
I was able to annotate the number of times I wanted the game to run, while still having the prompt read out.
I also utilized a print statement at the beginning to test out which number was generated so I could properly test out different scenarios:

![image](https://user-images.githubusercontent.com/104124602/221640887-97690bef-7ff3-4687-967a-fb1a6152756d.png)

Leading to the desired output:

![image](https://user-images.githubusercontent.com/104124602/221640952-f9417c65-c587-4967-baa6-47b9cf06b391.png)

The second problem that I ran into was if any input besides an integer was entered when prompted. Here is the original code:

![image](https://user-images.githubusercontent.com/104124602/221640998-531911c6-8188-4692-b3e8-20277b85088f.png)

With the following output in the console:

![image](https://user-images.githubusercontent.com/104124602/221641064-2e5e98ba-e79f-4279-88ae-4c8998e3ec75.png)

To fix this, I added a try and catch statement when prompting the user for a number:

![image](https://user-images.githubusercontent.com/104124602/221641136-5fd21058-8df0-4042-b812-11876649548b.png)

Leading to the desired output:

![image](https://user-images.githubusercontent.com/104124602/221641175-217efad6-fa92-4400-8689-efcbb006e9ff.png)


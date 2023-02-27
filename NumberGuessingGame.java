/* The purpose of this program is to create a game
where the user must guess the number that the computer
has generated in the allotted amount of guesses. */

/* Importing the Random and Scanner modules 
to generate a random number and take user inputs.*/

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    // Creating Random number generator that the player must guess.
    Random randomGenerator = new Random();

    // To take user input.
    Scanner input = new Scanner(System.in);

    // Randomly generated number.
    int computerGeneratedNumber = randomGenerator.nextInt(1, 20);

    System.out.println("Hello! Welcome to the Number Guessing Game! \n");
    System.out.println("Let's see if you can guess the number in 4 guesses. \n");
    System.out.println("I am thinking of a number between 1 and 20. \n");

    // Amount of guesses that the player has taken.
    int guessCount = 0;
    Boolean gameContinue = true;
    // Main while loop for the number guessing game.
    while (gameContinue == true && guessCount < 4) {
      try {
        System.out.println("Please enter an integer between 1 and 20: \n");
        int numberGuess = input.nextInt();
        if (numberGuess >= 1 && numberGuess <= 20) {
          // This is where we get into different instances depending if the guess is
          // correct.
          // Player correctly guesses the number.
          if (numberGuess == computerGeneratedNumber) {
            System.out.println("You correctly guessed the number!\n");
            System.out.println("Thank you for playing! Have a good day!\n");
            break;
          }
          // Player's guess is lower than the generated number.
          else if (numberGuess < computerGeneratedNumber) {
            System.out.println("Your guess is lower than my number.\n");
            guessCount += 1;
            continue;
          }
          // Player's guess is higher than the generated number.
          else if (numberGuess > computerGeneratedNumber) {
            System.out.println("Your guess is higher than my number.\n");
            guessCount += 1;
            continue;
          }
        } else {
          continue;
        }
      } catch (Exception e) {
        input.nextLine();
      }
    }
    // Player has run out of guesses.
    if (guessCount == 4) {
      System.out.println("You have guessed " + guessCount + " times.\n");
      System.out.println("The number I was thinking of was " + computerGeneratedNumber + ".\n");
      System.out.println("Thank you for playing! Have a good day!");
    }
  }
}
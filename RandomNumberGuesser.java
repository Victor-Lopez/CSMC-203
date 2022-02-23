/*

 * Class: CMSC203 

 * Instructor: Professor Khandan Vahabzadeh Monshi

 * Description: this driver is where main is stored, this is where the game is created by getting user input

 * Due: 2/22/2022

* Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Victor Lopez

*/

import java.util.Scanner;

public class RandomNumberGuesser 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		RNG rng = new RNG();
		
		int randNum, nextGuess, lowGuess, highGuess;
		
		String answer;
		
		do // do/while loop to run the program as user inputs yes
		{
			rng.resetCount(); // resets the counter to 0
			
			randNum = rng.rand(); // generates a random # and passes it to randNum
			
			lowGuess = 0; // initialize lowGuess to 0
			highGuess = 100; // initialize highGuess to 100
			
			System.out.println("Random Number Guessing Game");
			System.out.println("Enter your first guess (0-100):"); // asks user for first guess
			nextGuess = input.nextInt();
				do  // do/while loop to run the following while the guessed # is not the random #
				{
					if (!rng.inputValidation(nextGuess, lowGuess, highGuess)) // if guessed number is out of the lower or higher limit
					{
						nextGuess = input.nextInt();                          // ask user to try again
						continue;  // continue with the program
					}
					
					System.out.println("Number of guesses is " + rng.getCount()); // displays the # of guesses
					if (nextGuess > randNum) // if statement, if guessed # is greater than random #, then:
					{
						highGuess = nextGuess;                                // pass guessed number to highGuess
						System.out.println("Your guess is too high");         // tell user their guess too high
					}
					else if (nextGuess < randNum) // else if the # is less than the random # then:
					{
						lowGuess = nextGuess;                                 // pass guessed # to lowGuess
						System.out.println("Your guess is too low");          // tell user their guess is too low
					}
					
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess); // tell user to guess between the new limits
					nextGuess = input.nextInt();
				}
				while (nextGuess != randNum);
				
				if (nextGuess == randNum)
				{
				
				System.out.println("Number of guesses is " + (rng.getCount() + 1)); // if guess is correct, then add 1 to their guess counter
				System.out.println("Congratulations, you guessed correctly");       // display message telling user they guessed right
				}
				
				System.out.println("Try again? (yes or no):"); // ask user if they'd like to try again
				answer = input.next();
		}
		while(answer.equals("yes")); // if yes, run the program again, if no end program
		
		System.out.println("Thanks for playing");
		System.out.println("Victor Lopez");
		
		

	}

}

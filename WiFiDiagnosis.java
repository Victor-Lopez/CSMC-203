/*

 * Class: CMSC203 

 * Instructor: Khandan Monshi

 * Description: WiFi Diagnosis in which it gives you steps to fix your WiFi 
 * connection and it goes down a list of steps until your connection gets better. 

 * Due: 2/08/2022

* Platform/compiler: Eclipse 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Victor Lopez

*/

import java.util.Scanner;

public class WiFiDiagnosis 
{

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //Scanner is used to get input from user
		
		String answer;
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		
		System.out.println("First step: reboot your computer\n"); //First step is to reboot your computer
		
		System.out.println("Are you able to connect with the internet? (yes or no)\n");
		
		answer = input.nextLine();
		
		if (answer.equals("yes")) //if statement to determine whether user put yes or no, if yes then it will complete line 46, terminate program
		{
			System.out.println("Rebooting your computer seemed to work");
		}
		else //if answer is no, then program will continue to step 2, ask if step 2 worked
		{
			System.out.println("\nSecond step: Reboot your router\n");
			System.out.println("Now are you able to connect to the router?\n");
			
			answer = input.nextLine();
			
			if (answer.equals("yes")) //if yes, then run line 57, terminate program
			{
				System.out.println("\nRebooting your router seemed to work");
			}
			else //if no, then continue to step 3, ask if step 3 worked
			{
				System.out.println("\nThird Step: Make sure the cables to your router are plugged in firmly and your router is getting power\n");
				System.out.println("Now are you able to connect to the router?\n");
				
				answer = input.nextLine();
				
				if (answer.equals("yes")) //if yes, run line 68, terminate program
				{
					System.out.println("\nchecking the routers cables seemed to work\n");
				}
				else //if no, continue to step 4, ask if step 4 worked
				{
					System.out.println("\nFourth Step: Move your computer closer to the router\n");
					System.out.println("Now are you able to connect to the router?\n");
					
					answer = input.nextLine();
					
					if (answer.equals("yes")) //if yes, run line 79, terminate program
					{
						System.out.println("Moving your computer closer to the router seemed to work");
					}
					else //if no, move to final step (step 5), terminate program
					{
						System.out.println("\nFifth step: Contact your ISP\n");
						System.out.println("Make sure your ISP is is hooked up to your router\n");
						
					}
				}
			}
			
			
		}
		System.out.println("\nVictor Lopez");
		
		

	}

}

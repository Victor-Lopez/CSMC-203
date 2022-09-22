/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: WifiDiagnosis, a class representing a wifi diagnosis program in which it gives the user multiple solutions 
 * to fix their wifi connection issues. If the issue is not fixed with the first solution, the next solution will be presented.
 * if none of the solutions work, then the user will be asked to contact their ISP.
 * Due: 09/22/2022 
 * Platform/compiler: VS Code
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Victor Lopez
*/


import java.util.Scanner;

public class wifiDiagnosis {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer;
        final String answerYes = "Done"; //variable used when solution is solved
        final String answerInvalid = "Invalid answer; try again"; //variable used when answer is invalid
        final String askIfWorked = "Did that fix the problem? (Yes or No)"; //variable used to ask if problem is solved
        
        System.out.println("\nIf you have a problem with internet connectivity " +
                           "this WiFi Diagnosis might work.\n");

        
                // *** first solution to be given ***
        System.out.println("Reboot the computer and try to connect"); 
        System.out.println(askIfWorked);

        answer = input.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {          //if statement to determine whether solution fixed the issue
            System.out.println("\n" + answerYes);
        }
        else if (answer.equalsIgnoreCase("No")) { //if solution did not fix problem, move to next solution
            
                        // *** Second solution given ***
            System.out.println("\nReboot the router and try to connect");
            System.out.println(askIfWorked);

            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) { //if statement to determine whether solution fixed the issue
                System.out.println("\n" + answerYes);
            }
            else if (answer.equalsIgnoreCase("No")) { //if solution did not fix problem, move to next solution

                                // *** third solution is given ***
                System.out.println("\nMake sure the cables connecting the router " + 
                                   "are firmly plugged in and power is getting to the router");
                System.out.println(askIfWorked);

                answer = input.nextLine();
                
                if (answer.equalsIgnoreCase("Yes")) { //if statement to determine whether solution fixed the issue
                    System.out.println("\n" + answerYes);
                }
                else if (answer.equalsIgnoreCase("No")) { //if solution did not fix problem, move to next solution
                    
                                        // *** fourth solution is given ***
                    System.out.println("\nMove the computer closer to the router and try to connect");
                    System.out.println(askIfWorked);

                    answer = input.nextLine();

                    if (answer.equalsIgnoreCase("Yes")) { //if statement to determine whether solution fixed the issue
                        System.out.println("\n" + answerYes);
                    }
                    else if (answer.equalsIgnoreCase("No")) { //if solution did not fix problem, move to next solution

                                // *** final solution ***
                        System.out.println("\nContact your ISP");
                    }
                    else {
                        System.out.println("\n" + answerInvalid);  // else statements for when user input is not valid
                    }
                }
                else {
                    System.out.println("\n" + answerInvalid);
                }

            }
            else {
                System.out.println("\n" + answerInvalid);
            }

        }
        else {
            System.out.println("\n" + answerInvalid);
        }

        input.close();
        System.out.println("Programmer: Victor Lopez");
    }

}
/**
*   This program is an example of input error.
*   With exception handling, the program will not crash for the input error.
*   With the use of loop, user has an chance to re-enter the data to correct the previous input mistake. 
*/


import java.util.Scanner;
import java.util.InputMismatchException;

public class HandleInputException {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean validInput = false;

    do {
      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();  // try to enter a double type, and see what happens.
  
        // Display the result
        System.out.println("The number entered is " + number);
        
        validInput = true;
      } 
	
      	catch (InputMismatchException ex) {
        ex.printStackTrace();  // output the exception trace information, so we can locate which line causes exception.
        input.nextLine(); // discard the previous input line including the enter key at then end of the line. 
       }	
	catch (RuntimeExeption ex) {
        ex.printStackTrace();  // output the exception trace information, so we can locate which line causes exception.
        input.nextLine(); // discard the previous input line including the enter key at then end of the line.
	}
	catch (Exception ex) {
        ex.printStackTrace();  // output the exception trace information, so we can locate which line causes exception.
        input.nextLine(); // discard the previous input line including the enter key at then end of the line.
	}
	finally{

	}
     }while (!validInput);  // so the user has a chance to re-enter the correct type of input
	System.out.println("program continues, after the try-catch block, and obtaining a correct input.");
  }
}

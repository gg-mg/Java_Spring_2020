/**
*   This program is an example of input error.
*   Without exception handling, the program will crash because of the input error.
*   And the user has no chance to re-enter the data to correct the input mistake.
*/


import java.util.Scanner;

public class TestInputException {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter an integer: ");
    int number = input.nextInt();  // try to enter a double type, and see what happens.
  
    // this line below will not be executed, because program already crashes in the previous line, 
	//   if there is an input error in the previous line. 
	//   Without exception handling, user has no second chance to provide a correct input
    System.out.println("The number entered is " + number); // Display the result
  }
}

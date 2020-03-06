/**
*   This program is an example of array index error.
*   With exception handling, the program will not crash for index error.
*    
*/

public class HandleArrayIndexException {
  public static void main(String[] args) {
    int[] list = new int[2]; 
	list[0] = 5;
	list[1] = 17;

    try {
		list[2] = 8;   // this line has index out of range exception.
        
        System.out.println("this line will not be executed, because the previous line has generated an exception");
    } 
    catch (ArrayIndexOutOfBoundsException ex) {
      ex.printStackTrace();  // output the exception trace information, so we can locate which line causes exception.
	  System.out.println("inside the catch block, handle exception here.");
    }
	System.out.println("program continues, after the try-catch block");
  }
}

/**
 * Program header: GeorgeGichukiHw6.java
 * 
 * Author: George Gichuki Class: Java, Monday and Wednesday 11:00am to 13.45pm
 * 
 * Brief Program Description: This is an application program that will create an
 * array, fill it with random values, sort these values and then print them out.
 */

public class GeorgeGichukiHw6 {

	public static void main(String[] args) {

		// output some basic info
		System.out.println("Java, Monday & Wednesday 11:00am to 13.45pm, George Gichuki, Hw6");

		// array declaration
		double[] myDoubleArray = new double[10];

		for (int i = 0; i < 10; i++) {
			myDoubleArray[i] = (int) (Math.random() * 100);
			System.out.println(myDoubleArray[i]);
		}
//		System.out.println("Numbers Generated: " + Arrays.toString(myDoubleArray));
		printArray(myDoubleArray);
	}

	public static void outputArray(double[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%4d", list[i]);
		}
	}

	public static void printArray(double array[]) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4d", array[i]);
		}
	}
}

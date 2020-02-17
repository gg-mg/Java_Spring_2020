/**Program header: GeorgeGichukiHw6.java
 * 
 * Author: George Gichuki 
 * Class: Java, Monday and Wednesday 11:00am to 13.45pm
 * 
 * Brief Program Description: 
 * This is an application program that will create an
 * array, fill it with random values, then sort these values. This program
 * prints both, the unsorted and the sorted arrays.
 */

public class GeorgeGichukiHw6 {

	public static void main(String[] args) {

		// output some basic info
		System.out.println("Java, Monday & Wednesday 11:00am to 13.45pm, George Gichuki, Hw6");

		// array declaration
		double[] myDoubleArray = new double[10];

		for (int i = 0; i < 10; i++) {
			myDoubleArray[i] = (double) (Math.random() * 100);

		}
		//arrays output
		printArray(myDoubleArray);		
		sort(myDoubleArray);
		printArray(myDoubleArray);
	}
	//printing array method
	public static void printArray(double[] list) {
		for (double eachElement : list) {
			System.out.printf("%4.2f ", eachElement);
		}
		System.out.println(".");
	}
	//array sorting method
	public static void sort(double arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					double temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}

			}

		}

	}

}

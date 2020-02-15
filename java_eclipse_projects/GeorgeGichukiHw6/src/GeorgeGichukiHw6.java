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
			myDoubleArray[i] = (double) (Math.random() * 100);

		}
		printArray(myDoubleArray);
		System.out.println(".");
		sort(myDoubleArray);
	}

	public static void printArray(double[] list) {
		for (double eachElement : list) {
			System.out.printf("%4.2f ", eachElement);
		}
	}

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
		for (double eachElement : arr)
			System.out.printf("%4.2f ", eachElement);
	}

}

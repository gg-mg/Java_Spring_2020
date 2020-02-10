/**
 * Program header: House.java
 *
 * Author: George Gichuki Class:CS-2163-EC02S
 *
 * Brief Program Description: 
 * This is an Object Oriented Program which follows the following sequence;
 * public class House
 * private data members
 * constructors
 * getters for private data members, setters for private data members 
 * effectors(methods that are not constructor/getter/setter).
 */

// class declaration
public class House {

	// private data declaration
	private double totalPrice;
	private double totalSquareFeet;

	// public constructor with two parameters in the body
	public House() {
		this(168000.00, 2398.2);
	}

	// public constructor that takes two parameters in the header of double type
	public House(double totalPrice, double totalSquareFeet) {
		this.totalPrice = totalPrice;
		this.totalSquareFeet = totalSquareFeet;
	}

	// public getter method for totalPrice
	public double getTotalPrice() {
		return this.totalPrice;
	}

	// public getter method for totalSquareFeet
	public double getTotalSquareFeet() {
		return this.totalPrice;
	}

	// public setter method for totalPrice
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	// public setter method for totalSquareFeet
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	// effector method named calPricePerSqf that calculates the price per square
	// feet
	public double calcPricePerSqf() {
		double pricePerSqf = totalPrice / totalSquareFeet;
		return pricePerSqf;
	}

	// effector method named calculatePerimeter that calculates the perimeter of the
	// circle
	public double calcPropertyTax(double taxPercentage) {
		double propertyTax = totalPrice * taxPercentage * 0.01;
		return propertyTax;
	}

}

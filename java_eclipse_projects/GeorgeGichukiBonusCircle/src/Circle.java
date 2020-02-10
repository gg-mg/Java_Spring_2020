// Program header: Circle.java

// Author: George Gichuki Class: CS-2163-EC02S

// class declaration
public class Circle {

	// private data named radius
	private double radius;

	// public constructor with a parameter in the body
	public Circle() {
		this(2.5);
	}

	// public constructor that takes one parameter in the header
	public Circle(double radius) {
		this.radius = radius;
	}

	// public getter method for the private data member
	public double getRadius() {
		return this.radius;
	}

	// public setter method for the private data member
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// effector method named calculateArea that calculates the area of the circle
	public double calculateArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	// effector method named calculatePerimeter that calculates the perimeter of the
	// circle
	public double calculatePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	/**
	 * effector method named calculateTotalCost that calculates the total cost.The
	 * calculateTotalCost method takes one parameter of double type, and calls
	 * method calculateArea() to calculate the area of the circle
	 */
	public double calculateTotalCost(double unitAreaCost) {
		double totalCost = unitAreaCost * this.calculateArea();
		return totalCost;
	}

} // end of class

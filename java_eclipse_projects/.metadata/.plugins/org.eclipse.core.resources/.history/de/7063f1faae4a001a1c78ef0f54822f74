
public class PassingParameterExampleForObject {
	public static void main(String[] args) {

		int myIntVar = 10;
		Student studentA = new Student("Mike", 3.85);

		System.out.println("in main, before processing:");
		System.out.printf("myIntVar:%5d, student name:%6s, gpa:%5.2f\n\n", myIntVar, studentA.getName(),
				studentA.getGpa());

		process(myIntVar, studentA);

		System.out.println("in main, after processing:");
		System.out.printf("myIntVar:%5d, student name:%6s, gpa:%5.2f\n\n", myIntVar, studentA.getName(),
				studentA.getGpa());
	}

	public static void process(int myInt, Student oneStudent) {

		myInt = 20; // change built-in type data's value does NOT carry back
		oneStudent.setGpa(4.00); // change object's value does carry back
		oneStudent.setName("John");

		System.out.println("inside processing:");
		System.out.printf("myIntVar:%5d, student name:%6s, gpa:%5.2f\n\n", myInt, oneStudent.getName(),
				oneStudent.getGpa());
	}

}

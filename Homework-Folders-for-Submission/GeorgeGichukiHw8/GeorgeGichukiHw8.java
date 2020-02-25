/** Program header:  GeorgeGichukiHw8.java
 *
 * Author:  George Gichuki
 * Class:   Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 *   This is the application class that has the main method.
 *   It creates an array of superclass type, then initializes it with objects
 *    of different subclass types. 
 *   It follows the class-interface design in version 1, with dynamic binding. 
 *   Two methods are provided; one for printing the arrays and the other for 
 *    adding the profits together. 
 *   All the movies are real but the data has been altered to meet the assignment requirements.
 */

public class GeorgeGichukiHw8{
	public static void main(String[] args){		

		//output some basic info
		System.out.println("Java, Monday & Wednesday 11:00am to 13.45pm, George Gichuki, Hw8 \n");
		
		//creating the array
	   	Movie[] list = new Movie[6]; 
		
		//child class objects
	   	list[0] = new Animated("Coco","Adrian Molina", 2017, 175.944, 0.304,807.194);
	   	list[1] = new Animated("Moana","John Musker", 2016, 150.043, 0.056, 690.816);		
    	list[2] = new Documentary("Inside Job","Charles Ferguson", 2010, 2.957, 2, 5.261);
   	 	list[3] = new Documentary("Apollo 11","Todd Douglas Miller", 2019, 9.296, 2,  2.759);
   	 	list[4] = new Drama("Rocketman","Dexter Fletcher", 2019, 40.482, 38.57715, 4.99);
	 	list[5] = new Drama("Schindler's List","Steven Spielberg",1994, 25.319, 12.00508, 1.75);
	
	 	printMovieInfo(list);
	 	calcTotalProfit(list);
	 	System.out.printf("Total profit for all the movies is:"
	 		+ " $%.3f million dollars\n", calcTotalProfit(list));
	}
	
	//method for printing 
  	public static void printMovieInfo(Movie [] listMovie) {  		
  		for (Movie eachElement : listMovie){   			
  				System.out.printf("%s Revenue $%.3f million dollars.\n"
  					+ " Profit $%.3f million dollars.\n\n", 
  					eachElement.toString(), eachElement.calcRevenue(),eachElement.calcProfit());  				
  			}	   			
  	}
  	
  	//method for adding the profits total
	public static double calcTotalProfit(Movie[] ourMovie){		
		double totalProfit = 0;
		for(Movie eachElement : ourMovie){			
			totalProfit += eachElement.calcProfit();
		}			
		return totalProfit;
	}

} 
	


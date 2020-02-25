/** Program header:  Movie.java
*
* Author:  George Gichuki
* Class:   Monday and Wednesday 11.00  to 13.45
*
* Brief Program Description:
*   This is the superclass Movie which is defined as abstract because it does
*    not implement what it inherits from the interface. 
*   Four private data fields are defined.
*   The constructors are two; a default constructor and a constructor
*    with four parameters.
*   There four public setters and four getters provided for
*    accessing the private data.     
*   One method is defined in this class.
*/

public abstract class Movie implements Profitable{		
	// private data 
	private String title;
	private String director;
	private int year;
	private double productionCost;
  
	//two constructors 
	public Movie() { 			
		this("Forrest Gump", "Robert Zemeckis", 1994, 200.395);		
	}
  
	public Movie(String title, String director, int year, double productionCost){		
		this.title = title;
		this.director = director;
		this.year = year;
		this.productionCost = productionCost;		
	}
  
	//getters
	public String getTitle(){ 			
		return title; 
	}	
	
	public String getDirector(){ 		
		return director; 
	}
	
	public int getYear(){ 			
		return year; 		
	}
	
	public double getProductionCost(){ 		
		return productionCost; 		
	}

	//setters
	public void setTitle(String title){ 		
		this.title = title; 		
	}
	
	public void setDirector(String director){ 		
		this.director = director; 		
	}
	
	public void  setYear(int year){ 		
		this.year = year; 
	}
	
	public void setProductionCost(double productionCost){ 
		
		this.productionCost = productionCost; 		
	}
	
	//effector 
	public String toString() {		
		String info = String.format("Movie %s was directed by %s in %d with production"
				+ " cost of $%.3f million dollars.\n ", title, director, year, productionCost);
		return info;
	}
  
} 
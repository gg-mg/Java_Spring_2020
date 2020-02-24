/** Program header:  Movie.java
*
* Author:  George Gichuki
* Class:   Monday and Wednesday 11.00  to 13.45
*
* Brief Program Description:
*   This is the superclass Movie which is defined as abstract because it does not implement
*    what it inherits from the interface. 
*   Four private data fields are defined with public setters and getters provided after 
*    the constructors. The constructors are two; a default constructor and a constructor
*   with four parameters.   
*   The overridden toString() method is originally defined in class Object, 
*   and all other classes are either direct subclasses of Object, or more generations 
*   down from ancestor class Object. 
*   For Employee class, because it does not explicitly declare its extended superclass , 
*   class Object is assigned as its superclass by default.
*/

public abstract class Movie implements Profitable{		
	// private data 
	private String title;
	private String director;
	private int year;
	private double productionCost;
  
	//two constructors 
	public Movie() { 			
		this("Forrest Gump", "Robert Zemeckis", 1994, 200.5);		
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
	
	//effectors 
	public String toString() {		
		String info = String.format("Movie %s was directed by %s in %d with production cost of %.3f millions. ", title, director, year, productionCost);
		return info;
	}
  
} 
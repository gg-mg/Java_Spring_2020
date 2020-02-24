/** Program header:  Drama.java
	*
	* Author:    George Gichuki
	* Class:     Monday and Wednesday 11.00 to 13.45
	*
	* Brief Program Description:
	*   This class extends from abstract class Movie, and implements the
	*    inherited abstract methods from its grandparent: interface Profitable.    
	*   Two private data fields; numOfTickets and averagePrice, are defined.
	*   Provided are; a default constructor and a constructor with six parameters.  
	*   Public getters and setters for all private data members.
	*   Three effectors are overridden from grandparent.
	*   It also provide its own version of toString() method.
*/
		
public class Drama extends Movie{

	// data variables 
	private int numOfTickets;  
	private double averagePrice;   
	 
	// two constructors 
	public Drama() { 
		super(); 
	}
	   
	public Drama(String title, String director, int year, double productionCost, int numOfTickets, double averagePrice) {
		super(title, director, year, productionCost);   
		this.numOfTickets = numOfTickets;
		this.averagePrice = averagePrice;
	}   

	//getters
	public int getNumOfTickets() { 
		return numOfTickets; 
	}

	public double getAveragePrice() { 
			return averagePrice; 
	}
		
	//setters
	public void setNumOfTickets(int numOfTickets) { 
		this.numOfTickets = numOfTickets;
	}
		
	public void setAveragePrice(double averagePrice) { 
		this.averagePrice = averagePrice; 
	}

	//effectors  ASK MIKE AT THE LAB
	public String getCategory() { 	
			
		return "drama";
	}
	  
	public double calcRevenue() {
			
		double revenueDrama = averagePrice * numOfTickets;
		return revenueDrama;
	}
	//ASK LAB
	public double calcProfit() {
		double profitDrama = calcRevenue() - getProductionCost();
		return profitDrama;
	}

	public String toString() {
		String fromParent = super.toString(); 
		if(calcRevenue() > 0) {
			String okcOwnMessage = String.format (", This is an %s movie, and it generates profit ", 
					getCategory()); 
			return fromParent + okcOwnMessage;
		}else
		{
			String texOwnMessage = String.format (", This is an %s movie, and it generates no profit ", 
					getCategory()); 
			return fromParent + texOwnMessage;
		}
			 	 
	}

		
		
		
}






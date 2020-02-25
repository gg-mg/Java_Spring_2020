/** Program header:  Documentary.java
	*
	* Author:  George Gichuki
	* Class:   Monday and Wednesday 11.00 to 13.45
	*
	* Brief Program Description:
	*   This class extends from abstract class Movie, and implements the
	*    inherited abstract methods from its grandparent: interface Profitable.    
	*   Two private data fields; numOfDistributors and premiumPaid, are defined.	 
	*   Also provided are; a default constructor and a constructor with six parameters,  
	*    public getters and setters for all private data members.
	*   There is overriding of the effectors from grandparent.
	*   It also provides its own version of toString() method.
*/
		
public class Documentary extends Movie{
	//private data variables 
	private int numOfDistributors;  
	private double premiumPaid;   
	 
	//two constructors 
	public Documentary() { 
		super(); 
	}
	   
	public Documentary(String title, String director, int year, double productionCost,
		int numOfDistributors, double premiumPaid) {
		super(title, director, year, productionCost);   
		this.numOfDistributors = numOfDistributors;
		this.premiumPaid = premiumPaid;
	}   

	//getters
	public int getNumOfDistributors() { 
		return numOfDistributors; 
	}

	public double getPremiumPaid() { 
			return premiumPaid; 
	}
		
	//setters
	public void setNumOfDistributors(int numOfDistributors) { 
		this.numOfDistributors = numOfDistributors;
	}
		
	public void setPremiumPaid(double premiumPaid) { 
		this.premiumPaid = premiumPaid; 
	}

	public String getCategory() { 				
		return "documentary";
	}
	  
	public double calcRevenue() {			
		double revenueDoc = premiumPaid * numOfDistributors;
		return revenueDoc;
	}
	
		public double calcProfit() {
		double profitDoc = calcRevenue() - getProductionCost();
		return profitDoc;
	}

	public String toString() {
		String fromParent = super.toString(); 
		if(calcProfit() > 0) {
			String desOwnMessage = String.format ("This is an %s movie, "
				+ "and it generates profit.\n", getCategory()); 
			return fromParent + desOwnMessage;
		}else
		{
			String moiOwnMessage = String.format ("This is an %s movie, "
				+ "and it generates no profit.\n", getCategory()); 
			return fromParent + moiOwnMessage;
		}
			 	 
	}

}






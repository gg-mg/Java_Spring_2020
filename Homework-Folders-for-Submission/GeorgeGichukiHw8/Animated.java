/** Program header:  Animated.java
 *
 * Author:  George Gichuki
 * Class:   Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 *   This class extends from abstract class Movie, and implements the
 *    inherited abstract methods from its grandparent: interface Profitable.    
 *   Two private data fields; royaltyRate and income, are defined.
 *   Also provided are; a default constructor and a constructor with six parameters,  
 *    public getters and setters for all private data members.
 *   There is overriding of the effectors from grandparent.
 *   It also provides its own version of toString() method.
 */
	
public class Animated extends Movie{
	//private data variables 
	private double royaltyRate;  
	private double income;   
 
	//two constructors 
	public Animated() { 
		super(); 
	}
   
	public Animated(String title, String director, int year, double productionCost,
		double royaltyRate, double income) {
		super(title, director, year, productionCost);   
		this.royaltyRate = royaltyRate;
		this.income = income;
	}   

	//getters
	public double getRoyaltyRate() { 
		return royaltyRate; 
	}

	public double getIncome() { 
		return income; 
	}
	
	//setters
	public void setRoyaltyRate(double royaltyRate) { 
		this.royaltyRate = royaltyRate;
	}
	
	public void setIncome(double income) { 
		this.income = income; 
	}

	//effectors  
	public String getCategory() { 			
		return "animated";
	}
  
	public double calcRevenue() {		
		double revenueAnim = income *royaltyRate;
		return revenueAnim;
	}	

	public double calcProfit() {		
		double profitAnim = calcRevenue() - getProductionCost();
		return profitAnim;
	}

	public String toString() {
		String fromParent = super.toString(); 
		if(calcProfit() > 0.0) {
			String myOwnMessage = String.format ("This is an %s movie,"
				+ " and it generates profit.\n", getCategory()); 
			return fromParent + myOwnMessage;
		}else
		{
			String hisOwnMessage = String.format ("This is an %s movie, "
				+ "and it generates no profit.\n", getCategory()); 
			return fromParent + hisOwnMessage;
		}
		 	 
	}

}



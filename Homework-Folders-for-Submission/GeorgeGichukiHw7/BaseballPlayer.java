/** Program header: BaseballPlayer.java
 *
 * Author: George Gichuki
 * Class:  Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 * This is the BaseballPlayer class which is a child of the Player class.
 * A static element is defined then,two private data elements are defined with the 
 * corresponding setter and getters provided. In the second constructor, 
 * the super keyword is used to inherit  properties of the parent class Player.
 * There are two effectors, one for calculating the statistics 
 * and the second which determines if the player should keep the status or not.    
 */
//child class with a static element and 2 private data elements
public class BaseballPlayer extends Player {
	
	public static final double BATTING_AVERAGE_TH = 0.25;
	private int numberOfHits;
	private int numberOfTATB;
	
	//two constructors: one default and the other with 8 parameters
	public BaseballPlayer() {
		this(22, "Eugenio Suarez", "Cincinatti Reds", "Third Baseman",7000000.00, 0.04, 179, 747);
	}
	
	public BaseballPlayer(int id, String playerName, String teamName, String position, double salary, 
		double commissionRate, int numberOfHits, int numberOfTATB){
		super(id, playerName, teamName, position, salary, commissionRate);
		this.numberOfHits = numberOfHits;
		this.numberOfTATB = numberOfTATB;
	}	
	//two constructors: one default and the other with 8 parameters
	public int getNumberOfHits() {
		return numberOfHits;
	}
	public int getNumberOfTATB() {
		return numberOfTATB;
	}	
	//setters
	public void setNumberOfHits(int numberOfHits) {
		this.numberOfHits = numberOfHits;
	}
	public void setNumberOfTATB(int numberOfTATB) {
		this.numberOfTATB = numberOfTATB;
	}
	//effector for calculating statistics
	public double calcStatistics() {
		double battingAverage = (numberOfHits + 0.00) / numberOfTATB;
		return battingAverage;
		
	}
	//effector for checking status
	public boolean determineStatus() {
		if (calcStatistics() > BATTING_AVERAGE_TH) {
			return true;
		}
		else {
			return false;
		}
	}
}
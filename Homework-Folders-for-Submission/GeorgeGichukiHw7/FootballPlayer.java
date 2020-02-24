/** Program header: FootballPlayer.java
 *
 * Author: George Gichuki
 * Class:  Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 * This is the FootballPlayer class which is a child of the Player class.
 * A static double is defined followed by two private data elements.
 * Getter and setters are provided further down after the constructors.
 * In the second constructor, the super keyword is used to inherit  properties
 * of the parent class Player. There are two effectors, one for calculating the statistics 
 * and the second which determines if the player should keep the status or not.    
 */
//child class with a static element and 2 private data elements
public class FootballPlayer extends Player {
	
	public static final double RUSHING_AVERAGE_TH = 3.5;
	private int numberOfYards;
	private int numberOfRushes;
	
	//two constructors: one default and the other with 8 parameters
	public FootballPlayer() {
		this(20, "Barry Sanders", "OSU", "running back",1750000.00, 0.02,1896, 520);
	}
	
	public FootballPlayer(int id, String playerName, String teamName, String position, double salary, 
		double commissionRate, int numberOfYards, int numberOfRushes){
		super(id, playerName, teamName, position, salary, commissionRate);
		this.numberOfYards = numberOfYards;
		this.numberOfRushes = numberOfRushes;
	}	
	//getters
	public int getNumberOfYards() {
		return numberOfYards;
	}
	public int getNumberOfRushes() {
		return numberOfRushes;
	}	
	//setters
	public void setNumberOfYards(int numberOfYards) {
		this.numberOfYards = numberOfYards;
	}
	public void setNumberOfRushes(int numberOfRushes) {
		this.numberOfRushes = numberOfRushes;
	}
	//effector for calculating statistics
	public double calcStatisticsF() {
		double rushingAverage = (numberOfYards + 0.00) / numberOfRushes;
		return rushingAverage;
		
	}
	//effector for checking status
	public boolean determineStatusF() {
		if (calcStatisticsF() > RUSHING_AVERAGE_TH) {
			return true;
		}
		else {
			return false;
		}
	}
}

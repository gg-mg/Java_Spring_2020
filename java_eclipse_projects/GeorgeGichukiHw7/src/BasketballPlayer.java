/** Program header:  GeorgeGichukiHw7.java
 *
 * Author:    George Gichuki
 * Class:     Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 *   This is the BasketballPlayer class which is a child of the Player class.
 *   A static double is defined then,
 *   two private data elements are defined with the corresponding setter and getters
 *   are provided.In the second constructor, the super keyword is used to inherit  properties
 *   of the parent class Player. There are two effectors, one for calculating the statistics 
 *   and the second which determines if the player should keep the status or not.    
 */

public class BasketballPlayer extends Player {
	
	
	public static final double SHOOTING_AVERAGE_TH = 0.32;
	private int shotsMade;
	private int shotsAttempted;
	
	public BasketballPlayer() {
		this(509, "Miles Plumlee", "Perth Wildcats", "Cente", 12500000.00, 0.01, 748, 1381);
	}
	
	public BasketballPlayer (int id, String playerName, String teamName, String position, double salary, 
			double commissionRate, int shotsMade, int shotsAttempted){
		super(id, playerName, teamName, position, salary, commissionRate);
		this.shotsMade = shotsMade;
		this.shotsAttempted = shotsAttempted;
	}	
	
	public int getShotsMade() {
		return shotsMade;
	}
	public int getShotsAttempted() {
		return shotsAttempted;
	}	
	public void setShotsMade(int shotsMade) {
		this.shotsMade = shotsMade;
	}
	public void setShotsAttempted(int shotsAttempted) {
		this.shotsAttempted = shotsAttempted;
	}
	public double calcStatisticsBB() {
		double shootingAverage = (shotsMade + 0.00) / shotsAttempted;
		return shootingAverage;
		
	}
	public boolean determineStatusBB() {
		if (calcStatisticsBB() > SHOOTING_AVERAGE_TH) {
			return true;
		}
		else {
			return false;
		}
	}
}



public class BaseballPlayer extends Player {
	public static final double BATTING_AVERAGE_TH = 0.25;
	private int numberOfHits;
	private int numberOfTATB;
	
	public BaseballPlayer() {
		this(22, "Eugenio Suarez", "Cincinatti Reds", "Third Baseman",7000000.00, 0.04, 179, 747);
	}
	
	public BaseballPlayer(int id, String playerName, String teamName, String position, double salary, 
			double commissionRate, int numberOfHits, int numberOfTATB){
		super(id, playerName, teamName, position, salary, commissionRate);
		this.numberOfHits = numberOfHits;
		this.numberOfTATB = numberOfTATB;
	}	
	
	public int getNumberOfHits() {
		return numberOfHits;
	}
	public int getNumberOfTATB() {
		return numberOfTATB;
	}	
	public void setNumberOfHits(int numberOfHits) {
		this.numberOfHits = numberOfHits;
	}
	public void setNumberOfTATB(int numberOfTATB) {
		this.numberOfTATB = numberOfTATB;
	}
	public double calcStatistics() {
		double battingAverage = (numberOfHits + 0.00) / numberOfTATB;
		return battingAverage;
		
	}
	public boolean determineStatus() {
		if (calcStatistics() > BATTING_AVERAGE_TH) {
			return true;
		}
		else {
			return false;
		}
	}
}
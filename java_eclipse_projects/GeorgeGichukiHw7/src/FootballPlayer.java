
public class FootballPlayer extends Player {
	
	public static final double RUSHING_AVERAGE_TH = 3.5;
	private int numberOfYards;
	private int numberOfRushes;
	
	public FootballPlayer() {
		this(20, "Barry Sanders", "OSU", "running back",1750000.00, 0.02,1896, 520);
	}
	
	public FootballPlayer(int id, String playerName, String teamName, String position, double salary, 
			double commissionRate, int numberOfYards, int numberOfRushes){
		super(id, playerName, teamName, position, salary, commissionRate);
		this.numberOfYards = numberOfYards;
		this.numberOfRushes = numberOfRushes;
	}	
	
	public int getNumberOfYards() {
		return numberOfYards;
	}
	public int getNumberOfRushes() {
		return numberOfRushes;
	}	
	public void setNumberOfYards(int numberOfYards) {
		this.numberOfYards = numberOfYards;
	}
	public void setNumberOfRushes(int numberOfRushes) {
		this.numberOfRushes = numberOfRushes;
	}
	public double calcStatisticsF() {
		double rushingAverage = (numberOfYards + 0.00) / numberOfRushes;
		return rushingAverage;
		
	}
	public boolean determineStatusF() {
		if (calcStatisticsF() > RUSHING_AVERAGE_TH) {
			return true;
		}
		else {
			return false;
		}
	}
}

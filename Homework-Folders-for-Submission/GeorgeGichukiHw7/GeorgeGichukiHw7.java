/** Program header: GeorgeGichukiHw7.java
 *
 * Author: George Gichuki
 * Class:  Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 * This class is the application class that has the main method.
 * It creates two instances of baseball players, football players and basketball players
 * with directly plugged in parameters. The players in this program are real but the 
 * data is not real .It has been changed to show one instance of keeping status to be true and 
 * the other to be false in each category.      
 */
//application class with a main method
public class GeorgeGichukiHw7 {
	public static void main(String[] args){
		
		//constructing the baseball players
		BaseballPlayer myBPlayer = new BaseballPlayer(19, "Joey Votto", "Cincinatti Reds", "First Baseman", 20000000.00, 0.01, 36, 137);
		BaseballPlayer hisBPlayer= new BaseballPlayer(57, "Joe Mauer", "Atlanta Hawks", "Catcher", 23000000, 0.02, 204, 866);		
		//constructing the football players
		FootballPlayer myFPlayer = new FootballPlayer(99, "Edgerrin James", "Arizona Cardinals", "Running Back", 1000000, 0.01, 2895, 800);
		FootballPlayer hisFPlayer= new FootballPlayer(23, "Derek Anderson", "Buffalo Bills", "Quarterback", 1120000, 0.02, 1674,534);
		//constructing the basketball players
		BasketballPlayer myBBPlayer = new BasketballPlayer(24, "Jeremy Lamb", "Indiana Pacers", "Shooting Guard", 3034000, 0.03, 1872,4204);
		BasketballPlayer hisBBPlayer= new BasketballPlayer(71, "Trae Young", "Atlanta Hawks", "Point Guard", 6067080, 0.02, 500, 2291);
		
		//the output for baseball players
		System.out.printf("player id: %d\nname: %s\nteam: %s\nposition: %s\nsalary: %.2f\ncommission rate: %.2f\n"
				+ "commision: %.2f\nnumber of times at bat: %d\nnumber of hits: %d\nstatistics: %.1f\nkeeping status: %s\n\n", myBPlayer.getId(),myBPlayer.getPlayerName(),
				myBPlayer.getTeamName(), myBPlayer.getPosition(), myBPlayer.getSalary(), myBPlayer.getCommissionRate(),
				myBPlayer.calcCommission(), myBPlayer.getNumberOfTATB(), myBPlayer.getNumberOfHits(), myBPlayer.calcStatistics(), myBPlayer.determineStatus());
		
		System.out.printf("player id: %d\nname: %s\nteam: %s\nposition: %s\nsalary: %.2f\ncommission rate: %.2f\n"
				+ "commision: %.2f\nnumber of times at bat: %d\nnumber of hits: %d\nstatistics: %.1f\nkeeping status: %s\n\n", hisBPlayer.getId(),hisBPlayer.getPlayerName(),
				hisBPlayer.getTeamName(), hisBPlayer.getPosition(), hisBPlayer.getSalary(), hisBPlayer.getCommissionRate(),
				hisBPlayer.calcCommission(), hisBPlayer.getNumberOfTATB(), hisBPlayer.getNumberOfHits(), hisBPlayer.calcStatistics(), hisBPlayer.determineStatus());
		//the output for football players
		System.out.printf("player id: %d\nname: %s\nteam: %s\nposition: %s\nsalary: %.2f\ncommission rate: %.2f\n"
				+ "commision: %.2f\nnumber of times at bat: %d\nnumber of hits: %d\nstatistics: %.1f\nkeeping status: %s\n\n", myFPlayer.getId(),myFPlayer.getPlayerName(),
				myFPlayer.getTeamName(), myFPlayer.getPosition(), myFPlayer.getSalary(), myFPlayer.getCommissionRate(),
				myFPlayer.calcCommission(), myFPlayer.getNumberOfYards(), myFPlayer.getNumberOfRushes(), myFPlayer.calcStatisticsF(), myFPlayer.determineStatusF());
		
		System.out.printf("player id: %d\nname: %s\nteam: %s\nposition: %s\nsalary: %.2f\ncommission rate: %.2f\n"
				+ "commision: %.2f\nnumber of times at bat: %d\nnumber of hits: %d\nstatistics: %.1f\nkeeping status: %s\n\n", hisFPlayer.getId(),hisFPlayer.getPlayerName(),
				hisFPlayer.getTeamName(), hisFPlayer.getPosition(), hisFPlayer.getSalary(), hisFPlayer.getCommissionRate(),
				hisFPlayer.calcCommission(), hisFPlayer.getNumberOfYards(), hisFPlayer.getNumberOfRushes(), hisFPlayer.calcStatisticsF(), hisFPlayer.determineStatusF());
		//the output for basketball players
		System.out.printf("player id: %d\nname: %s\nteam: %s\nposition: %s\nsalary: %.2f\ncommission rate: %.2f\n"
				+ "commision: %.2f\nnumber of times at bat: %d\nnumber of hits: %d\nstatistics: %.1f\nkeeping status: %s\n\n", myBBPlayer.getId(),myBBPlayer.getPlayerName(),
				myBBPlayer.getTeamName(), myBBPlayer.getPosition(), myBBPlayer.getSalary(), myBBPlayer.getCommissionRate(),
				myBBPlayer.calcCommission(), myBBPlayer.getShotsAttempted(), myBBPlayer.getShotsMade(), myBBPlayer.calcStatisticsBB(), myBBPlayer.determineStatusBB());
	
		System.out.printf("player id: %d\nname: %s\nteam: %s\nposition: %s\nsalary: %.2f\ncommission rate: %.2f\n"
				+ "commision: %.2f\nnumber of times at bat: %d\nnumber of hits: %d\nstatistics: %.1f\nkeeping status: %s\n\n", hisBBPlayer.getId(),hisBBPlayer.getPlayerName(),
				hisBBPlayer.getTeamName(), hisBBPlayer.getPosition(), hisBBPlayer.getSalary(), hisBBPlayer.getCommissionRate(),
				hisBBPlayer.calcCommission(), hisBBPlayer.getShotsAttempted(), hisBBPlayer.getShotsMade(), hisBBPlayer.calcStatisticsBB(), hisBBPlayer.determineStatusBB());
	}	
}

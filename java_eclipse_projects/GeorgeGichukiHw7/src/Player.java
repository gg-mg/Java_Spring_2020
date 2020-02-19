
public class Player {
	private int id;
	private String playerName;
	private String teamName;
	private String position;
	private double salary;
	private double commissionRate;
	
	public Player() {
		this(20, "Barry Sanders", "OSU", "running back",1000000.00, 0.02);
	}
	
	public Player(int id, String playerName, String teamName, String position, double salary, 
			double commissionRate) {
		this.id =id;
		this.playerName =playerName;
		this.teamName = teamName;
		this.position = position;
		this.salary = salary;
		this.commissionRate = commissionRate;
	}
	public int getId() {
		return id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public String getPosition(){
		return position;
	}
	public double getSalary() {
		return salary;
	}
	public double getCommissionRate(){
		return commissionRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void getCommissionRate(double commissionRate){
		this.commissionRate = commissionRate;
	}
	public double calcCommission() {
		double commission = salary * commissionRate;
		return commission;
	}
}	

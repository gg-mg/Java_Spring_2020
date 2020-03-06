
public class Tool extends RentalItem {
	private int daysRent;
	private double dailyRentalFee;
	
	public Tool() {	
		super();		
	}
	
	public Tool(int id, String description, double processingFee, int daysRent, double dailyRentalFee )
	{
		super(id, description, processingFee);
		this.daysRent = daysRent;
		this.dailyRentalFee = dailyRentalFee;		
	}
	
	public int getDaysRent() {
		return daysRent;
	}
	
	public double getDailyRentalFee() {
		return dailyRentalFee;
	}
	
	public void setDaysRent(int daysRent) {
		this.daysRent = daysRent;
	}
	
	public void setDailyRentalFee(double dailyRentalFee) {
		this.dailyRentalFee = dailyRentalFee;
	}
	
	public double calcRentalFee() {
		double rentalFee = (daysRent * dailyRentalFee) + getProcessingFee();
		return rentalFee;
	  }
		
}

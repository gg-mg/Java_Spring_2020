
public class HospitalPatient {
	
	private double dailyBedCharge;
	private int numberOfDaysAdmitted;
	private double costOfMedicine;
	
	public HospitalPatient() {		
		this(34.62, 6, 121.08);		
	}
	
	public HospitalPatient(double dailyBedCharge, int numberOfDaysAdmitted, double costOfMedicine) {
		
		this.dailyBedCharge = dailyBedCharge;
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;
		this.costOfMedicine =costOfMedicine;
	}
	
	public double getDailyBedCharge() {
		return dailyBedCharge;
	}
	
	public int getNumberOfDaysAdmitted() {
		return numberOfDaysAdmitted;
	}
	
	public double getCostOfMedicine() {
		return costOfMedicine;
	}
	
	
	public void setDailyBedCharge(double dailyBedCharge) {
		this.dailyBedCharge = dailyBedCharge;
	}
	
	public void setNumberOfDaysAdmitted(int numberOfDaysAdmitted) {
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;
	}
	
	public void setCostOfMedicine(double costOfMedicine) {
		this.costOfMedicine = costOfMedicine;
	}
	
	public double calcTotalCost() {
		double totalCost = (dailyBedCharge * numberOfDaysAdmitted) + costOfMedicine;
		return totalCost;
	}
	
	public double calcDiscountedPrice(double copayDiscount) {
		double discountedPrice =  ((dailyBedCharge * numberOfDaysAdmitted) + costOfMedicine) 
				- (((dailyBedCharge * numberOfDaysAdmitted) + costOfMedicine) *
				(copayDiscount * 0.01));
		return discountedPrice;
	}
	
	

}

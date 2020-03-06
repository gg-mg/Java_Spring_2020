
public class Car extends RentalItem {
  private int mileTravelled;
  private double chargesPerMile;
  
  public Car() {
	  super();
  }
  
  public Car (int id, String description, double processingFee, int mileTravelled, double chargesPerMile) {
	  super(id, description, processingFee);
	  this.mileTravelled = mileTravelled;
	  this.chargesPerMile = chargesPerMile;
  }
  
  public int getMileTravelled() {
	  return mileTravelled;
  }
  
  public double getChargesPerMile() {
	  return chargesPerMile;
  }
  
  public void setMileTravelled(int mileTravelled) {
	  this.mileTravelled = mileTravelled;
  }
  
  public void setChargesPerMile(double chargesPerMile) {
	  this.chargesPerMile = chargesPerMile;
  }
  
  public double calcRentalFee() {
	  double rentalFee = (mileTravelled * chargesPerMile) + getProcessingFee();
	  return rentalFee;
  }
  
}

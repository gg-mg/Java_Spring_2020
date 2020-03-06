public class RentalItem {	
	private int id;
	private String description; 
	private double processingFee;
	
	public RentalItem() {
		this(20, "truck", 29.54);
	}
	
	public RentalItem(int id, String description, double processingFee) {
		this.id = id;
		this.description = description;
		this.processingFee = processingFee;
	}
	
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public double getProcessingFee() {
		return processingFee;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setProcessingFee(double processingFee) {
		this.processingFee = processingFee;
	}
		
}

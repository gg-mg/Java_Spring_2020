import java.util.Scanner;
public class GeorgeGichukiTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double dailyRate =45.90;	
		int stayedDays = 10;
		double drugCharges = 12.69;
		
		HospitalPatient babuHospitalPatient = new HospitalPatient(dailyRate, stayedDays,drugCharges);
		
		HospitalPatient maraHospitalPatient = new HospitalPatient();
		
		System.out.print("Enter the daily hospital bed fees :");
		double bedFees = input.nextDouble();
		
		System.out.print("Enter the number of days stayed at the hospital :");
		int hospitalStay = input.nextInt();
		
		System.out.print("Enter the total drug charges: ");
		double medCharge = input.nextDouble();
		
		maraHospitalPatient.setDailyBedCharge(bedFees);
		maraHospitalPatient.setNumberOfDaysAdmitted(hospitalStay);
		maraHospitalPatient.setCostOfMedicine(medCharge);
		
		System.out.print("Enter the copay insurance discount: ");
		
		double insuranceDisc = input.nextDouble();
		
		double priceTotalB = babuHospitalPatient.calcTotalCost();
		double discPriceB = babuHospitalPatient.calcDiscountedPrice(insuranceDisc);
		double priceTotalM = maraHospitalPatient.calcTotalCost();
		double discPriceM = maraHospitalPatient.calcDiscountedPrice(insuranceDisc);
		
		System.out.printf("\nTotal bill of the first patient before "
				+ "discount%7.2f\n", priceTotalB);
		
		System.out.printf("Insurance discount%6.2f%%\nTotal to pay "
				+ "after discount%7.2f\n", insuranceDisc, discPriceB);
		
		System.out.printf("\nTotal bill of the second patient before "
				+ "discount%7.2f\n", priceTotalM);
		
		System.out.printf("Insurance discount%6.2f%%\nTotal to pay "
				+ "after discount%7.2f\n", insuranceDisc, discPriceM);
		
	}
}

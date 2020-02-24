/** Program header:  Profitable.java
 *
 * Author:    George Gichuki
 * Class:     Monday and Wednesday 11.00 to 13.45
 *
 * Brief Program Description:
 *   This is the interface, and it has abstract methods to be implemented by it subclass.
 *   There are three methods that the inheriting classes will add data to.    
 */

public interface Profitable {

	//abstract methods
	public String getCategory();
	public double calcRevenue();
	public double calcProfit();

}

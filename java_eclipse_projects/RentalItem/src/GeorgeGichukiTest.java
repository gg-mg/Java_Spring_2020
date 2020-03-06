
public class GeorgeGichukiTest {
	public static void main(String[] args) {
		
		Car car = new Car(202, "Mazda", 10.00, 100,2.3);
		Tool tool = new Tool(350, "Axe", 5.05, 7, 4.0);
		
		System.out.printf("This id %d is for %s car. Rental fee %.2f.", car.getId(),
				car.getDescription(), car.calcRentalFee());
				 
		System.out.printf("This id %d is for %s car. Rental fee %.2f.", tool.getId(),
				tool.getDescription(), tool.calcRentalFee());
		
		int a = 7;
		System.out.printf("a is %d\n",  a++);
		System.out.printf("a is %d\n",  a);
		
		int j=8, k=9;		
		for(int i = 0; i < 5; i++){ 
		     k = k  -  j++ * i;
		     System.out.printf("this is i %s\n",i);	
		     //System.out.printf("this is j++ %s\n",j++);
		     System.out.printf("this is j %s\n",j);
		     System.out.printf("this is k %s\n",k);
		}
		int b = 4;
		int c = 10;
		int d =15;
		b=c=d;
		
		System.out.println(d);
		
	     double[]  prices = {15.20,  8.59,  12.47};
	     double average;
	     // finish the code below to invoke method calcAverage which takes array prices defined above as the only actual parameter.
	     average  = calcAverage(prices);   

	     System.out.printf ("average is: %.2f\n", average );	
	     
	     String ard = new String("Uka nake");
	     String muki = new String("Nikuo gicagi");
	     System.out.println(ard.equals(muki));	
	     if(!ard.equals (muki)) {
	    	 System.out.println("Rurii");
	     }
	     String s1 = "Technology";
	     System.out.println(s1.length());
	     System.out.println(s1.indexOf('r'));
	     System.out.println(s1.substring(2));

	     System.out.println(String.valueOf(14));
	     System.out.println(String.valueOf(14.5));
	     
	     double x= 5;
	     double y= 6;
	     x=y;
	     System.out.printf(" x divided by 2 %.2f and y %.2f\n",x/2,y);
	     
	   	
	    
	    double profit = 70;
	    double retVal = ( profit <= 0 ) ?  0 :  profit * 0.1;
	    System.out.println(retVal);
	    
	    String base = new String ("domingo");
	    
	    String name = base.equals("uppercase")?"CADEN" : "caden";
	    int name1 = base.compareTo("room");
	    
	    System.out.println(name);
	    System.out.println(name1);
	    
	    int v = 3; 
	    int w = 5;
	    double z = v / w;
	    int g = 3; 
	    int f = 5;
	    double h = (double) g / f;
	    
	    System.out.printf("z is %s, h is %s",z,h);

	    


	}
	
	public static double calcAverage(double[] demio) {
		double total = 0;
		for (int i=0; i < demio.length; i++) {
			total += demio[i];
		}
		double average = total/demio.length;		
		return average;
	}
	


}

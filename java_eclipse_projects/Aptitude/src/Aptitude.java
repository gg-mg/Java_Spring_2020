
public class Aptitude {
	public static void main(String[] args) {
		
		int[] list = new int[3];
		list[0]=1;
		list[1]=2;
		list[2]=3;
		
		int size =3; 
		int k = size;
		int j = size;
		int total = 0;
		for (int k=0; k<3; k++) {
			
			for(int j=0; j<3; j++) {
			
				total = total + list[j];
				}
				
			}
			
		System.out.println(k);
		
		System.out.println(total);
	}

}

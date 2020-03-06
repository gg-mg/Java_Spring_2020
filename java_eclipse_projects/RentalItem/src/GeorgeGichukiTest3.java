
public class GeorgeGichukiTest3 {	
		public static void main(String[] args) {
			
			
			 int[] yam ={12, 25, 36, 39, 43 ,65, 78, 86, 99, 108, 121};
			 int key = 80;
			 binarySearch(yam, key);
			 binarySearch1(yam,yam[0],yam.length-1, key);
			 int first = yam[0];
			 int last = yam [yam.length -1];
			
	}
		

		  public static int binarySearch(int[] list, int key) {
		    int lowIndex = 0;
		    int highIndex = list.length - 1;
		    System.out.printf("lowIndex %d\n",lowIndex);
		    System.out.printf("highIndex %d\n\n",highIndex);
		    System.out.printf("key %d\n\n",key);
		    while (highIndex >= lowIndex) {
		      int midIndex = (lowIndex + highIndex) / 2; 
		      if (key < list[midIndex]){  
				highIndex = midIndex - 1; 
				System.out.printf("lowIndex %d\n",lowIndex);
			    System.out.printf("highIndex %d\n",highIndex);
			    System.out.printf("midIndex %d\n\n",midIndex);
			    System.out.printf("key %d\n\n",key);
			 }
		      else if (key > list[midIndex]){  
				lowIndex = midIndex + 1; 
				System.out.printf("lowIndex %d\n",lowIndex);
			    System.out.printf("highIndex %d\n",highIndex);
			    System.out.printf("midIndex %d\n\n",midIndex);
			    System.out.printf("key %d\n\n",key);
			 }
		      else if (key == list[midIndex]){ 
				return midIndex; 			   
			 }
		    } // end of while loop
		 
		    return -1;
		   
		  } // end of binary search method
		  
		  public static void binarySearch1(int arr[], int first, int last, int key){  
			   int mid = (first + last)/2;  
			   while( first <= last ){  
			      if ( arr[mid] < key ){  
			        first = mid + 1;     
			      }else if ( arr[mid] == key ){  
			        System.out.println("Element is found at index: " + mid);  
			        break;  
			      }else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
			 }  
		 
}
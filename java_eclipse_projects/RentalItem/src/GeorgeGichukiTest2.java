
public class GeorgeGichukiTest2 {
	public static void main(String[] args) {
		//create the grid
	    final int row = 6;
	    final int col = 5;
	    int [][] grid = new int [row][col];
	    
	    for (int i = 0; i < grid.length; i++) {
	        for (int j = 0; j < grid[i].length; j++) {
	            grid[i][j] = (int)(Math.random()*10);
	        }
	    }
	    printInfo(grid);
	    increase(grid);
	    printInfo(grid);
	    System.out.println(sum(grid));
	    
	    String bt = "bookTitle";
	    for (int i = 0; i < bt.length(); i++) {
	    	System.out.println(bt.charAt(i));
	    }
	    System.out.println(bt.substring(0,2));
		
	}
	 public static void printInfo(int[][] list){
		    System.out.println("\nthe ragged array you enter is: ");
		    for (int i = 0; i < list.length; i++){
		      for (int j = 0; j < list[i].length; j++){
		        System.out.print(list[i][j] + " ");
		      } // end of inner loop
		      System.out.println('a'); // end of output for one row
			} // end of outer loop
		  } // end of printInfo method
	
	public static void increase(int[][] scores) {
		for(int i=0;i<scores.length;i++) {
		for(int j=0;j<scores[i].length;j++) {
		scores[i][j] = scores[i][j] * 10;
		}
	 }
   }
	public static int sum(int[][] scores) {
		int total = 0;
		for(int i = 0; i < scores.length;i++) {
			for(int j = 0; j < scores[i].length;j++) {
				total+=scores[i][j];
			}
		}
		return total;
	}

	
}

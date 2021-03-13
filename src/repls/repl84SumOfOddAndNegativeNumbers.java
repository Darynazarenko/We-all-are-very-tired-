package repls;

public class repl84SumOfOddAndNegativeNumbers {

	public static void main(String[] args) {
	/*
	 * Write a program that prints the total number of elements
	 *  that are negative AND odd
	 */
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int count=0;
	   for(int[] each:a) {
		   for(int num:each) {
			   
			   if(num<=0 && num%2!=0 ) {
				   
				  count+=1;
				  
				   
			   }
		   }
		  
		  
	   }
	   System.out.println(count);
	}

}

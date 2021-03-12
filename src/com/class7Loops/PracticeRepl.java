package com.class7Loops;

public class PracticeRepl {

	public static void main(String[] args) {
		
		/*
		 * Print all even numbers from 0 to 13 using while loop
		 */
		//loop counter declaration 
		int number=2;
		
		// variable to store limit / N
		int n=13;
		
		
		   while(number<=n){
			   // here is condition to check EVEN numbers
			   if(number%2==0) {
				   System.out.println(" " + number);
				   number+=2;
			   }
		     
		   }
		   
		   System.out.println("-----------------");
			   int i =7;
			   while(i<=98){
			     System.out.println(i);
			     i+=7;
			   }
			 System.out.println("-----------------------");
			   int start=20;
			   int end=1;
			   do{
			     System.out.println(start);
			     start-=2;
			   }while(start>=end && end>=0);
			   
			   System.out.println("-----------------------");
			   
			   for(int j=2; j<=14; j++){
				   if(j%2==0) {
					   
				   System.out.println(j);
				   }
				      
				    }
			 }
			
			   
}

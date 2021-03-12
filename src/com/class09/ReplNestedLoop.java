package com.class09;

public class ReplNestedLoop {

	public static void main(String[] args) {
		/*Write a program to print out the pattern: 

			1 2 3 4 5 6 7 8 9 10 

			2 4 6 8 10 12 14 16 18 20 

			3 6 9 12 15 18 21 24 27 30 

			4 8 12 16 20 24 28 32 36 40 

			5 10 15 20 25 30 35 40 45 50*/
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=10; c++) {
				System.out.print(c*r+" ");
				
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		for (int i = 1; i <= 4; i++) {
		      for (int j = 1; j <= 4; j++) {
		        if ((i == 2 || i == 3) && (j == 2 || j ==3)) {
		          System.out.print(" ");
		          continue;
		        }
		        System.out.print("$");
		      }
		      System.out.print("\n");
		    }
		
	}

}

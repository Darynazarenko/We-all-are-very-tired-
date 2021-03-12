package com.class09;

public class Patterns {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0; j<=5; j++)
			System.out.print("* ");
		}
		System.out.println("");
		
		// print output 1 2 3 4 5 6
		//              1 2 3 4 5 6
        //            1 2 3 4 5 6
		for(int i=1; i<=5; i++) {
			for(int j=1; j<5; j++) {
			System.out.print(i+" ");
		}
System.out.println();
		}

for(int r=1; r<=5; r++) {
	for(int j=1; j<=r; j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}

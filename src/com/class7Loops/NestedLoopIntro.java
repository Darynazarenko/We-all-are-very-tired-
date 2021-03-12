package com.class7Loops;

public class NestedLoopIntro {

	public static void main(String[] args) {
		
	for(int i=1; i<3; i++) {
		
		System.out.println("I am outer loop");
		
		for(int j=1; j<=3; j++) {
			
			System.out.println("I am inner lopp");
			
		}
	}
	int num = 0;
	while(num<=8) {
		System.out.println(num);
		num++;
	}
	System.out.println("-------------------------------------");
	
	int num1=15;
	  while(num1>=0){
	    System.out.println(num1);
	    num1--;
	  }

	}

}

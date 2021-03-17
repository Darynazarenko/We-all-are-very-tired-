package com.com13;

public class MoreExamplesTester {

	public static void main(String[] args) {
		MoreExamples obj1= new MoreExamples();
		
		System.out.println(obj1.print());
		
		System.out.println(obj1.doubleTheValue(10));
		
		obj1.isRaining(true);
		
	    obj1.str();
	    System.out.println(obj1.greaterNum(2, 50));
	    
	    obj1.number(3);
		
	    double [] arr= {10, 23, 4};
	System.out.println(obj1.returnTheArray(arr));
	
	System.out.println(obj1.isPalindrome ("aba"));
	System.out.println(obj1.isPalindrome ("agh"));
	}

}

package com.class04;

public class NestedIfLastExp {

	public static void main(String[] args) {
		/*
		 * to donate you have to be 18 and older;
		 * your weight must be more than 110 lb, otherwise you cannot donate
		 */
		
		int age = 23;
		double  weight = 12;
		
		if(age>=18) {
			if(weight>=110) {
				System.out.println("You can be a donnor");
			}else {
				System.out.println("Get weight");
			}
			
		}else {
			System.out.println("not old enough");
		}
			
			
				

	

}
}
package com.clas08;

public class BreakKeyword {

	public static void main(String[] args) {
		boolean rain = true;
		int temp = 76;
		while(rain) {
			System.out.println("I will stay at home");
			if(temp>75) {
				
			System.out.println("I will go for waalk");
			break;
			}
			temp+=2;
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println("Hello");
			if(i==5) {
			break;
		}
		System.out.println("I am inside your loop");
	}

}
}
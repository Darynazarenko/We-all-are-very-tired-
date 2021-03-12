package com.class7Loops;

public class loopIntro {

	public static void main(String[] args) {
		int time = 10;
		
		while(time<12) {
			System.out.println("hello");
			time++;
		}
		System.out.println("====print numbers from1 to 10===============");
		
		int num = 1;
		
		while(num<11) {
			System.out.println(num);
			num++;
	
		}
		System.out.println("===========print numbers from 20 to 40 ===========");
		
		num = 20;
		while(num<40) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println("==============printt numbers from 10 to 1===============");
		
		int a = 10;
		while(a>+1) {
			System.out.print(a+" ");
			a--;
		}
	}

}

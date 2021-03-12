package com.class7Loops;

public class ClassTask {

	public static void main(String[] args) {
		
	System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for(int i =100; i>=1; i--) {
			System.out.println(i + " ");
		}
		System.out.println("Print even numbers from 20 to 1 (2 ways)");
		for(int i =20; i>=2; i-=2) {
			System.out.println(i + " ");
		}
		
		for(int i = 20; i >=2; i--) {
			System.out.println((i -2 )+ " ");
		}
		System.out.println("Print odd numbers between 20 and 50 (2 ways)");
		for(int i=21; i<=50; i+=2) {
			System.out.println(i+" ");
		}
		int sum =21;
		for(int i=21; i<=49; i++) {
			sum=sum+=2;
			System.out.print(sum+" ");
		}
		for(int i=2; i<=14; i+=2){
		      System.out.println(i);
		    }
	}

}

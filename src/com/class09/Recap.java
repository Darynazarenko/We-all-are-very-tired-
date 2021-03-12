package com.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a nested for loop
		
				for(int i=1; i<4; i++) {
					for(int j=1; j<5; j++) {
						System.out.println("Good evening");
					}
					System.out.println("-------------------");
				}
			System.out.println("-------------------");	
				
				for(int i=1; i<3; i++) {
					
					for(int j =1; j<=4; j++) {
						System.out.println(i+ " " + j);
					}
				}
				
				System.out.println("--------------------");
				//print numbers from 10 to 99 using nested loop
				
				for(int i=0; i<10; i++) {
					for(int j=0; j<=9; j++) {
						System.out.println(i+ " " +j);
					}
				}
				System.out.println("----------- Car Odometer ------------------");
				
				for(int i=0; i<10; i++) {
					for(int j=0; j<10; j++) {
						for(int k=0; k<10; k++) {
							for(int n=0; n<10; n++) {
								System.out.println(i+" "+ j+" "+k+" "+n);
							}
						}
					}
				}
				System.out.println("-------Clock---------------");
				
				for(int h=0; h<24; h++) {
					for(int m=0; m<60; m++) {
						
						if (h < 10) {
							System.out.print("0");
						}
						System.out.print(h + ":");
						if (m < 10) {
							System.out.print("0");
						}
						System.out.println(m);
					}
				}
			}
		}
		

	



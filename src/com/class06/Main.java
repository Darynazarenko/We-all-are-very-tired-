package com.class06;

import java.util.Scanner;

public class Main {

	 
		 public static void main(String[] args){
			   Scanner scan = new Scanner(System.in);
			   System.out.println("Are you thirsty?");
			   boolean thirsty = scan.nextBoolean();
			   System.out.println("Are you sleepy?");
			   boolean sleepy = scan.nextBoolean();
			  String drink=null;
			  if(thirsty || !sleepy){
			    drink="water";
			  }else if(thirsty || sleepy){
			    drink="coffe";
			  }else if(!thirsty || sleepy){
			    drink="tea";
			  }else{
			    drink="nothing";
			  }
			  System.out.println("Looks like you need drink "+drink);
			 }
			}
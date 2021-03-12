package com.clas08;

import java.util.Scanner;

public class PrcticeRepl {
 public static void main(String[] args) {
	 
	/*
	 * Write a program to print out the pattern:

1 2 3 4 5 6 7 8 9 10

2 4 6 8 10 12 14 16 18 20

3 6 9 12 15 18 21 24 27 30

4 8 12 16 20 24 28 32 36 40

5 10 15 20 25 30 35 40 45 50
	 */
	 
	 int lines=5;  
	  int i=1;  
	  int j;  
	    for(i=1;i<=lines;i++){// this loop is used to print the lines  
	        for(j=1;j<=i;j++){// this loop is used to print lines  
	            System.out.print(i*j+" ");  
	        }  
	         System.out.println("");  
	    }  
	  }  
	}  
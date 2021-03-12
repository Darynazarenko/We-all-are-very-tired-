package com.class10;

public class NamesArray {

	public static void main(String[] args) {
		/*
		 *  Create an array of names and store all names of your group.
		 *   Then print your name from that array. (use 2 different ways of creating an array). */
		
		String[] names=new String[9];
		names[0]="Mirage Kamran";
		names[1]="Kenza";
		names[2]="Yuliya (Philadelphia, PA)";
		names[3]="Safiet Dzhemaliadinov (Chicago, IL)";
		names[4]="Aisha";
		names[5]="Daryna Nazarenko";
		names[6]="Aryan";
		names[7]="Yara";
		names[8]="Zhanna";
		//System.out.println(names[5]);
		

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("---------Second Way-------------");
		
		
		String[] names1= {"Mirage Kamran", "Kenza", "Yuliya (Philadelphia, PA)", "Safiet Dzhemaliadinov (Chicago, IL)", "Aisha", 
				"Daryna Nazarenko ", "Aryan", "Yara", "Zhanna" };
		System.out.println(names[3]);
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
Print the following sentence using elements of array: “Saturday is Java coding Day”.›
		 */
		String[] words= {" Java", " Saturday", " day", " coding", " is"};
		System.out.println(words[1]+ words[4]+ words[0]+ words[3]+ words[2]);
		
		
		
		
		}
	}



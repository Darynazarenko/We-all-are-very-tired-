package com.class15;

public class UpperToLowerCase {

	public static void main(String[] args) {
		String var1="Hello";
		System.out.println(var1.toLowerCase());
		System.out.println(var1.toUpperCase());
		var1="Hello 123";
		System.out.println(var1.toLowerCase());// HELLO 123
		System.out.println(var1);// Hello 123-----> original value bc we havent reisaignsd it
		var1=var1.toUpperCase();// riessigment
		System.out.println(var1);// HELLO 123 
	}

}
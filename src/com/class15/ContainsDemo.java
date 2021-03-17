package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		
		String var=" This is a demo of contain ##";
		System.out.println(var.contains("#"));
		
		if(var.contains("#")) {
			System.out.println(" # are not allowed");
		}

	}

}

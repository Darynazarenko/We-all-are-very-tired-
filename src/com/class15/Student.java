package com.class15;

public class Student {
// properties
	String name;
	int age;
	String studentID;
	String schoolName;
	
	// bihaviour
	void study() {
		System.out.println(name+ " studies in "+ schoolName);
	}
	void payTuition() {
		System.out.println(name+"pays the tuition " );
	}
	
	
	
	
	
	public static void main(String[] args) {
		Student ramObj=new Student();// creating an object
		
		ramObj.name="Ram";
		ramObj.age=25;
		ramObj.studentID="CD456";
		ramObj.schoolName="Syntax";
		ramObj.study();
		ramObj.payTuition();
		
	}
}

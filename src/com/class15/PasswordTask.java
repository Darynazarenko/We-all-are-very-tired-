package com.class15;

public class PasswordTask {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty".
Password should be minimum 8 characters, if less → message="Password is too short".
Password cannot contain username if so, → message="Password cannot contain username".
Password should match confirmed password, if not  → message="Passwords do not match".
Only after all requirements met → message "Your username and password has been created"
		 */
		
		String userName="Daryna123";
		String password="DN23666@";
		String newPass="DN123666@";
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Password and username cannot be empty");
		} else if(password.length()<8) {
			System.out.println(" Password is too short");
		} else if(userName.equals(password)) {
			System.out.println("Password cannot contain username");
		} else if(!password.equals(newPass)) {
			System.err.println("Password do not match ");
			
		}else if (!password.contains(newPass)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		

	}


}
package com.class12;

public class Account {
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passrdUserNameWhenLogging,
			String passedPasswordWhenLogging) {
		if(userName.equals(passrdUserNameWhenLogging) && password.equals(passedPasswordWhenLogging)) {
			System.out.println("Wellcome to the Bank of America your balance is "+ balance);
		}else {
			System.out.println("Wrong credantials");
		}
	}
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your accaunt number i " + accountNumber+" Your balance is " + balance);
		}
	}
	

}

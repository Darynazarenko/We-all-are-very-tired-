package com.class12;

public class Dog {
	
		
	public String breed;
	public String size;
	public String colour;
	public int age;
	
	public void bark() {
		System.out.println("wow wow");
	}
	public void sleep() {
		System.out.println("ZZZZZzzzzzzz.....");
	}
	public void eat() {
		System.out.println("Omnomnomn");
	}
	public void look() {
		System.out.println("Hi I am here my colour is " + colour);
	}
	

	public static void main(String[] args) {
		
		Dog Bulldog=new Dog();
		
		Bulldog.breed="Bulldog";
		Bulldog.size="Large";
		Bulldog.colour="Light Gray";
		Bulldog.age=5;
		Bulldog.bark();
		Bulldog.sleep();
		Bulldog.eat();
		Bulldog.look();
		
		
		Dog Beagele=new Dog();
		Beagele.breed="Beagele";
		Beagele.size="Large";
		Beagele.colour="Orange";
		Beagele.age=6;
		Beagele.look();
		
		Dog GS=new Dog();
		GS.breed="German Shepher";
		GS.size="Large";
		GS.colour="White and Orange";
		GS.age=6;
	
		
	}

}

package com.class11;

public class SelfTask {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian.
		 *  Then retrieve all values from that array using 2 different loops


Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
 Retrieve all values from that array using 2 different loops
		 */
		
		String[][] cars= {
				{"Ford","Doge"},
				{"BMw", "Audi"},
				{"Hinday"},
				{"Ferrari"}
		};
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("-------for each------");
			for(String[] car:cars) {
				for(String n:car) {
					System.out.println(n+ " ");
				}
			}
		
         System.out.println("=== Second task=====");
         
         String[][] grocery= {
        		 {"Tomato","Carrot"},
        		 {"Apple", "Banana"},
        		 {"Milk"},
        		 {"Cookies"}
        		 
         };
         
         for(int i=0; i<grocery.length; i++) {
        	 for(int j=0; j<grocery[i].length; j++ ) {
        		 System.out.print(grocery[i][j]+", ");
        	 }
        	 System.out.println();
         }
         
         for(String[]items:grocery) {
        	 for(String item:items) {
        		 System.out.print(item+ ", ");
        	 }
        	 System.out.println();
         }



	}

}

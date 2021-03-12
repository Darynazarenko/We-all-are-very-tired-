package com.class10;

public class ArraayIntro {

	public static void main(String[] args) {
		int num=20;
	     num=20;
	     
	     System.out.println(num);
	     
	     
	     
	     int[] array=new int[5];
	     array[0]=10;
	     array[1]=12;
	     array[2]=15;
	     array[3]=9;
	     array[4]=13;
	     
	     System.out.println(array[0]+ array[3]);// 10+13=23
	     
	     double[] numbers=new double[2];
	     numbers[0]=12.99;
	     numbers[1]=19.01;
	     numbers[0]=11.99;//reassining
	     System.out.println(numbers[0]);
	     
	     
	     String[] names=new String[3];
	     names[0]= "Daryna";
	     names[1]="Sam";
	    // names[2]="Zeek";--> null(Array are  fixed in size, compiler adds null value because of the size)
	   //  names[3]="XXX";---> out of bound exeppion( java.lang.ArrayIndexOutOfBoundsException)
	     System.out.println(names[2]);
	     
	     boolean[] bool=new boolean[3];
	     bool[0]=true;
	     bool[1]=false;
	     bool[2]= false;
	     
	     System.out.println(bool[1] );
	     
	   int size=  bool.length;
	   System.out.println(size);

	}

}

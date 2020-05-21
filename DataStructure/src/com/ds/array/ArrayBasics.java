package com.ds.array;

public class ArrayBasics {

	public static void main(String[] args) {

		//How to declare an array : dataType[] arrayName 
		double[] data ;
		
		// But how many elements this array can hold 
		data = new double[10];
		
		// another example
		int[] age;
		age = new int[5];  // Here age is an aaray which can hold 5 values of int type
		
		// we can also declare and allocate memory to an array in one single line
		int[] age1 = new int[5];
		
		// Initializing array in Java 
		int[] age2 = {12,4,5,2,5};
		String[] names = {"nitin", "rahul","nidhi","sachin"};
		
		// traversing and printing elements of an array
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Element at index " +i +": " + age2[i]);
		}
		
		for (int i=0; i< names.length ;i++){
			System.out.println("Element at index "+i +" : "+names[i]);
		}
		
		// replace element in an array
		
		names[0] = "nitin choudhary";
		for (int i=0;i<names.length;i++){
			System.out.println("Element at index "+i +" : "+names[i]);
		}
		
		
		
	}

}

package com.array;

public class ArrayMainClass  {

	public static void main(String[] args) {
		int array[] = new int[10];
		ArrayOperation e  =  new ArrayOperation();
		
		//Taking values from user
		e.insertValueInArray(array);
		
		//Checking duplicate value as per user input
		System.out.println("is duplicate: "+e.duplicate(array, 12));
		
		e.printArray(array);
		
		
		
	}

}

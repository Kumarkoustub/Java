package com.school;

public class Person {
	private static String name ;
	private double phone;
	private String gender;
	private int age;
	
	
	
     public Person(String name, double phone, String gender, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.age = age;
	}



	public static String getName() {
		return name;
	}



	public static void setName(String name) {
		Person.name = name;
	}



	public double getPhone() {
		return phone;
	}



	public void setPhone(double phone) {
		this.phone = phone;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	
	
	
	
	
	

}

package com.school;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pe = new Person(null, 0, null, 0);
		Person pr = new Person(null, 0, null, 0);
		
		
//		System.out.println(pe.getName());
		pe.setName("kk");
		System.out.println(pe.getName());
		pr.setName("pachi");
		System.out.println(pe.getName());
		pe.setAge(24);
		System.out.println(pe.getAge());
		
		System.out.println(pr.getAge());

	}

}

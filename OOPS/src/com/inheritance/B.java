package com.inheritance;

public class B extends A {
	
	public B() {
		this(10);
		System.out.println("C");
	}
	
	public B(int x) {
		super();
	System.out.println(x);	
	}
	
}

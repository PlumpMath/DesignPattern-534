package com.templateMethod;

public abstract class SuperClass {

	public abstract void method1();
	
	public abstract void method2();
	
	public abstract void method3();
	
	public void template(){
		
		System.out.println("start");
		
		this.method1();
		this.method2();
		this.method3();
		
		System.out.println("end");
		
	}
	
	
}


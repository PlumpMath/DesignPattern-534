package com.templateMethod;

public class SubClass extends SuperClass{

	@Override
	public void method1() {
		 System.out.println("method1 did");
		
	}

	@Override
	public void method2() {
		 System.out.println("method2 did");
		
	}

	@Override
	public void method3() {
		 System.out.println("method3 did");
		
	}

	public static void main(String[] args) {
	 
		//如果父类有特殊的构造方法 可能会覆盖无参构造方法的  那么子类就必须自己写个构造方法去调用父类的
		//一般情况下 父类有无参构造方法，子类就不用显式调用了
		SuperClass sub  = new SubClass();
		sub.template();
		
	}
	
	
}



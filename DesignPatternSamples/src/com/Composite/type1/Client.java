package com.Composite.type1;

public class Client {
	public static void main(String[] args) {
		
		
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();
		Leaf leaf3 = new Leaf();
		
		Composite component1 = new Composite();
		component1.add(leaf1);
		component1.add(leaf2);
		component1.add(leaf3);
		
		
		Leaf leaf21 = new Leaf();
		Leaf leaf22 = new Leaf();
 
		Composite component2 = new Composite();
		component2.add(leaf21);
		component2.add(leaf22);
		component1.add(component2);
		
		
		//调用！
		component1.doSomeThing();
		
		
	}
}

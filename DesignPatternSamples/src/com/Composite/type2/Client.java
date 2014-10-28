package com.Composite.type2;

public class Client {
	public static void main(String[] args) {
		
		
		ComponentI leaf1 = new Leaf();
		ComponentI leaf2 = new Leaf();
		ComponentI leaf3 = new Leaf();
		
		ComponentI component1 = new Composite();
		component1.add(leaf1);
		component1.add(leaf2);
		component1.add(leaf3);
		
		
		ComponentI leaf21 = new Leaf();
		ComponentI leaf22 = new Leaf();
 
		ComponentI component2 = new Composite();
		component2.add(leaf21);
		component2.add(leaf22);
		component1.add(component2);
		
		
		//调用！
		component1.doSomeThing();
		
		
	}
}

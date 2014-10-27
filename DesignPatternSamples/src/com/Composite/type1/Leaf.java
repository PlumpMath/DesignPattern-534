package com.Composite.type1;

public class Leaf implements ComponentI {

	@Override
	public void doSomeThing() {
		 
		System.out.println(this+" Leaf did");

	}

}

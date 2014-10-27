package com.Composite.type2;

import java.util.List;

public class Leaf implements ComponentI {

	@Override
	public void doSomeThing() {
		System.out.println(this+" Leaf did");
	}

	@Override
	public void add(ComponentI component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ComponentI component) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ComponentI> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}



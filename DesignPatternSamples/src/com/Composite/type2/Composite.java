package com.Composite.type2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ComponentI{

	
	private List<ComponentI> elements = new ArrayList<ComponentI>();
	
	@Override
	public void doSomeThing() {
		for (ComponentI component : elements) {
			component.doSomeThing();
		}
	}

	@Override
	public void add(ComponentI component) {
		 
		elements.add(component);
	}

	@Override
	public void delete(ComponentI component) {
		elements.remove(component);
	}

	@Override
	public List<ComponentI> getAll() {
		return elements;
	}

}



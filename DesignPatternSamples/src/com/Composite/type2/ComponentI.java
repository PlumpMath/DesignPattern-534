package com.Composite.type2;

import java.util.List;

public interface ComponentI {

	public void doSomeThing();
	
	public void add(ComponentI component);
	
	public void delete(ComponentI component);
	
	public List<ComponentI> getAll();
}



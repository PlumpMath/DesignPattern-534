package com.adapter.type2;

/**
 * 对象适配器 采用对象组合的方式
 * @author wz
 *
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter (Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	
	@Override
	public void method1() {
		this.adaptee.methodFilan();
	}

}



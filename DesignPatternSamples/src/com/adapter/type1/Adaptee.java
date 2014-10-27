package com.adapter.type1;

/**
 * 由于以及过时，需要被适配的类 
 * @author wz
 *
 */
public class Adaptee {

	public void methodFilan(){
		
		System.out.println("最终想调用的方法，由于接口不一样，没法调用 ，"
				+ "所以需要适配器来转换");
	}
	
}



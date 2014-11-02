package com.simpleFactory;

/**
 * 具体产品类
 * @author wzfzlw
 *
 */
public class IPhone6Plus extends IPhone{
	@Override
	public void showMe() {
		 System.out.println("this is IPhone6Plus ");
	}
	@Override
	public String toString() {
		return "this is IPhone6Plus ";
	}
}


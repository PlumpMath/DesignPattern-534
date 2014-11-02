package com.simpleFactory;

/**
 * 具体产品类
 * @author wzfzlw
 *
 */
public class IPhone5s extends IPhone{
	@Override
	public void showMe() {
		 System.out.println("this is IPhone5s ");
	}
	@Override
	public String toString() {
		return "this is IPhone5s ";
	}
}


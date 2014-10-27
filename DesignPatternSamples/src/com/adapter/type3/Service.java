package com.adapter.type3;

public class Service extends ServiceAdapter{

	/**
	 * 通过Adapter  就可以只实现某个我想要的方法
	 * 不用全部实现一遍了
	 */
	@Override
	public void service1() {
		System.out.println("hello world");
	}
}

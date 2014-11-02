package com.simpleFactory;

public class Client {
	public static void main(String[] args) {
		
//		对于客户端来说 就非常省力 不用去new对象 不用做任何创建对象所需的细节操作
//		直接调用以下静态工厂方法  就得到了对象
//		用起来既省力，又实现了解耦
		
		//这个模式又叫做静态工厂方法模式  因为工厂类里的工厂方法总是静态的！
		
		System.out.println(   IPhoneFactory.createIPhone("iphone4s")  );
		System.out.println(   IPhoneFactory.createIPhone("iphone5s")  );
		System.out.println(   IPhoneFactory.createIPhone("iphone6Pluse")  );
		
	}
}

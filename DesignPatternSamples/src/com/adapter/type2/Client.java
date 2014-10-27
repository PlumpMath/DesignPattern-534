package com.adapter.type2;

public class Client {

	public static void main(String[] args) {
		
		Target tar = new Adapter(new Adaptee());
		tar.method1();
	
	}
	
}

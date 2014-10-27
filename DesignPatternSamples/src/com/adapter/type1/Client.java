package com.adapter.type1;

public class Client {

	public static void main(String[] args) {
		
		Target tar = new Adapter();
		tar.method1();
	
	}
	
}

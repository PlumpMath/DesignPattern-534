package com.adapter.type1;


/**
 * 适配器 
 * 用户只能使用Target接口定义的方法，但是又想实现Adaptee里的功能 
 * 这就要靠这个适配器了
 * @author wz
 *
 */
public class Adapter extends Adaptee  implements Target{

	@Override
	public void method1() {
		
		//相当于把Adaptee类的methodFilan()方法  给  适配成了Target 的 method1()
		//用户通过method1 间接的调用了methodFilan
		methodFilan();
		
	}
 
}



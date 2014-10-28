package com.Composite.type1;

import java.util.ArrayList;
import java.util.List;


/**
 * 相当于Suite类 
 * 要能够管理子部件
 * @author wz
 *
 */
public class Composite implements ComponentI {

	
	//为什么用ComponentI? 因为既要管理叶子节点，又要管理普通节点
	//就像Suite  里面要可以放Suite  也可以放TestCase 
	//所以 实现了共同接口ComponentI  使其成为可能
	private List<ComponentI>  elements = new ArrayList<ComponentI>();
	
	
	//管理子部件的功能
	public void add(ComponentI component){
		elements.add(component);
	}
	
	
	//管理子部件的功能
	public void delete(ComponentI component){
		elements.remove(component);
	}
	
	
	/**
	 * 对于一个组件类  它自己肯定没法执行操作，要执行的是它的子部件的操作
	 * 所以 我只要遍历List 
	 * 
	 * 妙处就在这里  只要遍历就可以了，完全不用管是个Leaf 还是个 Component！
	 * 反正最终执行的都是Leaf！
	 * 
	 * 这其实是一个隐藏的递归吧！
	 */
	@Override
	public void doSomeThing() {
		
		//如果是叶子节点，遍历到就执行了
		//如果不是叶子节点，那么接着对它做遍历，最终叶子节点会执行的
		for (ComponentI component : elements) {
			component.doSomeThing();
		}

	}

}

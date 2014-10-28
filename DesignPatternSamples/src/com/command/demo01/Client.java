package com.command.demo01;

/**
 * 客户
 * @author wz
 *
 */
public class Client {

	
	public static void main(String[] args) {
		
		//直到接收者（指定专属厨师）
		Receiver  receiver = new Receiver();
		
		//创建命令（点个菜）
		CommandI command = new CommandConcerte(receiver);
		
		//调用者 （叫来服务员 把点好的单子给它）
		Invoker invoker  = new Invoker(command);
		
		//服务员去指挥厨师了  执行命令，执行命令做的是什么？做的是接收者做的事情
		invoker.doInvokeAction();
	}

	
 
	
	
}

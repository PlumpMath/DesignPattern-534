package com.command;

/**
 * 客户
 * @author wz
 *
 */
public class Client {

	
	public static void main(String[] args) {
		
		//直到接收者
		Receiver  receiver = new Receiver();
		
		//创建命令
		CommandI command = new CommandConcerte(receiver);
		
		//调用者
		Invoker invoker  = new Invoker(command);
		
		invoker.doInvokeAction();
	}

	
 
	
	
}

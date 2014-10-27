package com.command;

/**
 * 请求者   服务员
 * 服务员从客户这里拿到命令，然后用这个命令去指挥厨师做菜
 * 至于做什么菜，怎么做，服务员不用知道，命令里写清楚了的。
 * @author wz
 *
 */
public class Invoker {

	//请求者 要调用命令，比如要持有一个命令对象
	private CommandI command;
	
	public Invoker(CommandI command){
		this.command = command;
	}
	
	public void  doInvokeAction(){
		command.excute();
	}
	
	
}

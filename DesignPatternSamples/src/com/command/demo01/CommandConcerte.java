package com.command.demo01;

/**
 * 具体命令角色，接收者和行为的若耦合
 * 接收者 和 行为的耦合
 * 厨师是接收者，
 * 厨师的行为是做菜，也就是receiver里面的doAction方法
 * 
 * 
 * 
 * 具体命令角色描述了谁要干什么
 * @author wz
 *
 */
public class CommandConcerte implements CommandI{

	private Receiver receiver;
	
	public CommandConcerte(Receiver receiver){
		this.receiver = receiver;
	}
	
	
	@Override
	public void excute() {
		this.receiver.doAction();
	}

}




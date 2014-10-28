package com.command.demo02;


/**
 * 调用者  录音机的键盘
 * @author wz
 *
 */
public class KeyBord {

	private Command commandPlay;
	private Command commandStop;
	private Command commandRecord;
	
	
	public void setCommandPlay(Command commandPlay){
		this.commandPlay = commandPlay;
	}
	public void setCommandStop(Command commandStop){
		this.commandStop = commandStop;
	}
	public void setCommandRecord(Command commandRecord){
		this.commandRecord = commandRecord;
	}
	
	
	
	/**
	 * 可以发现 作为调用者  要做的事情就是执行Command的excute方法
	 * 那么接收者修改了代码的话 Command的实现类需要修改，
	 * 而调用者这里，啥都不用改，只需要用接口去调用就好了 始终是执行一个excute方法呗
	 */
	public void play(){
		this.commandPlay.excute();
	}
	public void stop(){
		this.commandStop.excute();
	}
	public void record(){
		this.commandRecord.excute();
	}
	
	
}

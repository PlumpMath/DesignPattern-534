package com.command.demo02;

/**
 * Lucy去操作录音机了！
 * @author wz
 *
 */
public class Lucy {

	public static void main(String[] args) {
		//创建接收者
		AudioPlayer player = new AudioPlayer();
		
		//创建命令
		Command playCommand = new CommandPlay(player);
		Command stopCommand = new CommandStop(player);
		Command recordCommand = new CommandRecord(player);
		
		//把调用者生成好 实现录音机的键盘
		KeyBord keybord = new KeyBord();
		keybord.setCommandPlay(playCommand);
		keybord.setCommandStop(stopCommand);
		keybord.setCommandRecord(recordCommand);
		
		//开始使用了
		keybord.play();
		keybord.stop();
		keybord.record();
		keybord.stop();
		keybord.play();
		
		
		/**
		 * 可以发现 这个命令模式里
		 * 真正会变化的  就是接收者的实现代码 ，以及Command实现类里面 调用接收者方法的
		 * 那部分代码
		 * 
		 * 
		 * 而客户和调用者 都是不用变化的  从而实现解耦
		 *
		 * 本质上的原因在于 客户端new出了AudioPlayer的实例 
		 * 但是客户端不直接去调用AudioPlayer的方法
		 * 
		 * 而是由
		 * Lucy 通过 KeyBord来执行Command
		 * 然后Command来调用AudioPlayer的方法 
		 *
		 * Lucy---> keybord.play() --->Command.excute() --->AudioPlayer.play()
		 * 
		 * 可见 Lucy和 AudioPlayer是完全解耦的
		 * 
		 */
		
	}
	
	
	
}

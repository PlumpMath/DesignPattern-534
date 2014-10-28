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
		
		
	}
	
	
	
}

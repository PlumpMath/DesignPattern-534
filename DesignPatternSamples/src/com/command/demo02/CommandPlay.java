package com.command.demo02;

public class CommandPlay implements Command{

	private AudioPlayer audioPlayer;
	
	public CommandPlay(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void excute() {
		//指挥 接收者  如果接收者的实现改变了 那么这里也会改变的。
		this.audioPlayer.play();
	}
	
	
	
}

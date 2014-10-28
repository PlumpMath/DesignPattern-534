package com.command.demo02;

public class CommandStop implements Command{

	private AudioPlayer audioPlayer;
	public CommandStop(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}
	
	@Override
	public void excute() {
		this.audioPlayer.stop();
	}

}

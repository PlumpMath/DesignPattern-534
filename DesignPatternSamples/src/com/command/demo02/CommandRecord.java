package com.command.demo02;

public class CommandRecord implements Command {

	private AudioPlayer audioPlayer;
	
	public CommandRecord(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}
	
	@Override
	public void excute() {
		this.audioPlayer.record();
		
	}
 
}

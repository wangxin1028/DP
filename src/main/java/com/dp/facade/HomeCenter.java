package com.dp.facade;

public class HomeCenter {
	private Light light;
	private AirCondition airCondition;
	private LoudSpeaker loudSpeaker;
	
	public HomeCenter(Light light,AirCondition airCondition,LoudSpeaker loudSpeaker){
		this.light = light;
		this.airCondition = airCondition;
		this.loudSpeaker = loudSpeaker;
	}
	
	public void arriveHome(){
		light.powerOn();
		airCondition.powerOn();
		loudSpeaker.playMusic();
	}
	
	public void leaveHome(){
		light.powerOff();
		airCondition.powerOff();
		loudSpeaker.stop();
	}
}


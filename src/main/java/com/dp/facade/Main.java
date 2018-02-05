package com.dp.facade;

public class Main {
	public static void main(String[] args) {
		AirCondition airCondition = new AirCondition();
		Light light = new Light();
		LoudSpeaker loudSpeaker = new LoudSpeaker();
		
		HomeCenter homeCenter = new HomeCenter(light, airCondition, loudSpeaker);
		
		//简化调用
		homeCenter.arriveHome();
		System.out.println("----------------------");
		homeCenter.leaveHome();
	}
}

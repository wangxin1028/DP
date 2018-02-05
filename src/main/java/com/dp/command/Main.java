package com.dp.command;

public class Main {
	public static void main(String[] args) {
		BluetoothAIBox box = new BluetoothAIBox();
		
		Light light = new Light();
		box.receiveCommand(new LightOnCommand(light));
		box.receiveCommand(new LightOffCommand(light));
	}
}

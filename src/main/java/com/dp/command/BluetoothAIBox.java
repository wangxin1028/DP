package com.dp.command;

public class BluetoothAIBox {
	private Command command;
	public void receiveCommand(Command command) {
		this.command = command;
		command.execute();
	}
	public Command getCommand() {
		return command;
	}
	
}

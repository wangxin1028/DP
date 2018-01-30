package com.effective.server;

public class BMWFactory implements CarFactory {

	@Override
	public Car buildCar() {
		return new BMW();
	}

}

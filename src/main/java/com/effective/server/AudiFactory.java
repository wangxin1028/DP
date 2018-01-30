package com.effective.server;

public class AudiFactory implements CarFactory {

	@Override
	public Car buildCar() {
		return new Audi();
	}

}

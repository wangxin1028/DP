package com.dp.factory.abstractfactory;

public class BMWCarStore extends CarStore {

	@Override
	public Car getCar() {
		return new BMWCar();
	}

}

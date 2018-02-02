package com.dp.factory.factorymethod;

public class BMWCarStore extends CarStore {

	@Override
	public Car getCar() {
		return new BMWCar();
	}

}

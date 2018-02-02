package com.dp.factory.factorymethod;

public class AudiCarStore extends CarStore {

	@Override
	public Car getCar() {
		return new AudiCar();
	}
	

}

package com.dp.factory.abstractfactory;

public class AudiCarStore extends CarStore {

	@Override
	public Car getCar() {
		return new AudiCar();
	}
	

}

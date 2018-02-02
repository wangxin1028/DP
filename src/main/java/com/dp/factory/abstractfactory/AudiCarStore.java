package com.dp.factory.abstractfactory;

public class AudiCarStore extends CarStore {

	@Override
	public Car getCar() {
		MaterialFactory materialFactory = new AudiMeterialFactory();
		return new AudiCar(materialFactory);
	}
	

}

package com.dp.factory.abstractfactory;

public class BMWCarStore extends CarStore {

	@Override
	public Car getCar() {
		MaterialFactory materialFactory = new BMWMeterialFactory();
		return new BMWCar(materialFactory);
	}

}

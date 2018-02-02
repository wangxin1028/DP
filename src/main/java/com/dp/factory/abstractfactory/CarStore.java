package com.dp.factory.abstractfactory;

public abstract class CarStore {
	
	public abstract Car getCar();
	
	public void orderCar() {
		Car car = getCar();
		car.prepare();
		car.check();
		car.regist();
		car.trade();
		car.show();
	}
}

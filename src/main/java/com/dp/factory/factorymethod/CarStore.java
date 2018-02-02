package com.dp.factory.factorymethod;

public abstract class CarStore {
	
	public abstract Car getCar();
	
	public void orderCar() {
		Car car = getCar();
		System.out.println(car.getName());
		car.check();
		car.regist();
		car.trade();
	}
}

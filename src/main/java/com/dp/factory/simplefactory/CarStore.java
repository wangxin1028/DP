package com.dp.factory.simplefactory;

public class CarStore {
	private SimpleCarFactory scf;
	public CarStore(SimpleCarFactory scf) {
		this.scf = scf;
	}
	public void orderCar(String carName) {
		Car car = scf.createCar(carName);
		System.out.println(car.getName());
		car.check();
		car.regist();
		car.trade();
	}
}

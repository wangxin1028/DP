package com.dp.factory.abstractfactory;

public class BMWCar extends Car {
	public BMWCar() {
		this.name = "宝马";
		this.materialFactory = new BMWMeterialFactory();
	}

	@Override
	public void prepare() {
		System.out.println("生产一辆宝马汽车");
		this.glass = materialFactory.getGlass();
		this.leather = materialFactory.getLeather();
		this.steel = materialFactory.getSteel();
	}
}

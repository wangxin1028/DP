package com.dp.factory.abstractfactory;

public class BMWCar extends Car {
	private MaterialFactory materialFactory;
	public BMWCar(MaterialFactory materialFactory) {
		this.name = "宝马";
		this.materialFactory = materialFactory;
	}

	@Override
	public void prepare() {
		System.out.println("生产一辆宝马汽车");
		this.glass = materialFactory.getGlass();
		this.leather = materialFactory.getLeather();
		this.steel = materialFactory.getSteel();
	}
}

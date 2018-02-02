package com.dp.factory.abstractfactory;

public class AudiCar extends Car {
	private MaterialFactory materialFactory;
	public AudiCar(MaterialFactory materialFactory) {
		this.name = "奥迪";
		this.materialFactory = materialFactory;
	}

	@Override
	public void prepare() {
		System.out.println("生产一辆奥迪汽车");
		this.glass = materialFactory.getGlass();
		this.leather = materialFactory.getLeather();
		this.steel = materialFactory.getSteel();
	}

}

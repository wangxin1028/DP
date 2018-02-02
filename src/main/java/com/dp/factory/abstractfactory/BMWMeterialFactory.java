package com.dp.factory.abstractfactory;

public class BMWMeterialFactory implements MaterialFactory {

	@Override
	public Steel getSteel() {
		return new BMWSteel();
	}

	@Override
	public Glass getGlass() {
		return new BMWGlass();
	}

	@Override
	public Leather getLeather() {
		return new BMWLeather();
	}

}

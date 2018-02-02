package com.dp.factory.abstractfactory;

public class AudiMeterialFactory implements MaterialFactory {

	@Override
	public Steel getSteel() {
		return new AudiSteel();
	}

	@Override
	public Glass getGlass() {
		return new AudiGlass();
	}

	@Override
	public Leather getLeather() {
		return new AudiLeather();
	}

}

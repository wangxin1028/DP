package com.dp.decorator;

public class Sausage extends Snacks {

	public Sausage(Noodles noodles) {
		super(noodles);
		this.describe = "烤肠";
	}

	@Override
	public double cost() {
		return noodles.cost()+2;
	}

}

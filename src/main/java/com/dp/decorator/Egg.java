package com.dp.decorator;

public class Egg extends Snacks{

	public Egg(Noodles noodles) {
		super(noodles);
		this.describe = "鸡蛋";
	}

	@Override
	public double cost() {
		return noodles.cost()+1;
	}

}

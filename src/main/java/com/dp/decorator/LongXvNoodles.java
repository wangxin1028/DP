package com.dp.decorator;

public class LongXvNoodles extends Noodles {
	
	public LongXvNoodles() {
		this.describe = "龙须面";
	}
	@Override
	public double cost() {
		return 10;
	}

}

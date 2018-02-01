package com.dp.decorator;

public class YangChunNoodles extends Noodles {
	
	public YangChunNoodles() {
		this.describe = "阳春面";
	}
	@Override
	public double cost() {
		return 12;
	}

}

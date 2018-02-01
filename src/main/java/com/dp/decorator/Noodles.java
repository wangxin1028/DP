package com.dp.decorator;

public abstract class Noodles {
	protected String describe = null;
	public void showDescribe() {
		System.out.println(describe);
	}
	public abstract double cost();
}

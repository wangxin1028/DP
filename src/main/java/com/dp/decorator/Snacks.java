package com.dp.decorator;

public abstract class Snacks extends Noodles {
	protected Noodles noodles;
	public Snacks(Noodles noodles) {
		this.noodles = noodles;
	}
	public void showDescribe() {
		noodles.showDescribe();
		System.out.println(describe);
	}
}

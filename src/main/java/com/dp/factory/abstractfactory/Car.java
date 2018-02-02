package com.dp.factory.abstractfactory;

public abstract class Car {
	protected Steel steel;
	protected Leather leather;
	protected Glass glass;
	protected MaterialFactory materialFactory;
	protected String name;
	public String getName() {
		return name;
	}
	public abstract void prepare();
	public void check() {
		System.out.println("试驾");
	}
	public void regist() {
		System.out.println("上牌");
	}
	public void trade() {
		System.out.println("过户");
	}
	public void show() {
		System.out.println(this.name);
		steel.show();
		leather.show();
		glass.show();
	}
}

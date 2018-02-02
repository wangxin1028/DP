package com.dp.factory.factorymethod;

public abstract class Car {
	protected String name;
	public String getName() {
		return name;
	}
	public void check() {
		System.out.println("试驾");
	}
	public void regist() {
		System.out.println("上牌");
	}
	public void trade() {
		System.out.println("过户");
	}
}

package com.dp.factory.simplefactory;

public class Main {
	public static void main(String[] args) {
		CarStore cs = new CarStore(new SimpleCarFactory());
		cs.orderCar("audi");
	}
}

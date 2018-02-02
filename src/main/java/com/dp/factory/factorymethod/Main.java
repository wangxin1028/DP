package com.dp.factory.factorymethod;

public class Main {
	public static void main(String[] args) {
		CarStore cs = new BMWCarStore();
		cs.orderCar();
	}
}

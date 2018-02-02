package com.dp.factory.abstractfactory;

public class Main {
	public static void main(String[] args) {
		CarStore cs = new BMWCarStore();
		cs.orderCar();
		
	}
}

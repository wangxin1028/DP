package com.effective.builder;

public class Main {
	public static void main(String[] args) {
		Car.Builder builder = new Car.Builder("奔驰", 40);
		Car car = builder.door(4).seat(5).speed(60).build();
		System.out.println(car);
	}
}

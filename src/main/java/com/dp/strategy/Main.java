package com.dp.strategy;

public class Main {
	public static void main(String[] args) {
		Duck redDuck = new RedQuack();
		redDuck.display();
		redDuck.fly();
		redDuck.quack();
		Duck greenDuck = new GreenDuck();
		greenDuck.display();
		greenDuck.fly();
		greenDuck.quack();
	}
}

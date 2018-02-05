package com.dp.adapter;

public class PLA implements Soldier {

	@Override
	public void combat() {
		System.out.println("步枪射击");
	}

	@Override
	public void train() {
		System.out.println("魔鬼训练");
	}

}

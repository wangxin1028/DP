package com.dp.adapter;

public class Main {
	public static void main(String[] args) {
		Barracks barrack = new Barracks();
		
		barrack.addSoldier(new PLA());
		//没有士兵，拿城管适配一个士兵
		barrack.addSoldier(new SoldierAdapter(new ChinaCityManagement()));
		
		barrack.war();
		barrack.training();
	}
}

package com.dp.decorator;

public class Main {
	public static void main(String[] args) {
		//加两个烤肠一个鸡蛋的龙须面
		Noodles noodles = new Sausage(new Sausage(new Egg(new LongXvNoodles()))); 
		noodles.showDescribe();
		double price = noodles.cost();
		System.out.println(price);
	}
}

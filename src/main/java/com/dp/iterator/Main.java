package com.dp.iterator;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Menu<MenuItem> cm = new CoffeeMenu();
		Menu<MenuItem> tm = new TeaMenu();
		
		Waitress waiter = new Waitress(Arrays.asList(cm,tm));
		
		waiter.printMenuItems();
 	}
}

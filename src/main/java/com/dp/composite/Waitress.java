package com.dp.composite;

import java.util.Iterator;

public class Waitress {
	private Menu allMenu;
	public Waitress(Menu allMenu) {
		this.allMenu = allMenu;
	}
	
	public void printMenu() {
		allMenu.print();
	}
	
	public void printExpensiveItems() {
		Iterator<MenuComponent> iterator = allMenu.createIterator();
		while(iterator.hasNext()) {
			MenuComponent next = iterator.next();
			try {
				if(next.getPrice()>15) {
					next.print();
				}
			} catch (Exception e) {}
		}
	}
}

package com.dp.iterator;

import java.util.List;

public class Waitress {
	private List<Menu<MenuItem>> menus;
	public Waitress(List<Menu<MenuItem>> menus) {
		this.menus = menus;
	}
	public void printMenuItems() {
		java.util.Iterator<Menu<MenuItem>> iterator = menus.iterator();
		while(iterator.hasNext()) {
			Menu<MenuItem> menu = iterator.next();
			printMenuItems(menu.iterator());
		}
	}
	private void printMenuItems(Iterator<MenuItem> iter) {
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

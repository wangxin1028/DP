package com.dp.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	private List<MenuComponent> childs = new ArrayList<>();
	private String name;
	public Menu(String name) {
		this.name = name;
	}
	
	public void add(MenuComponent menuComponent) {
		childs.add(menuComponent);
	}
	public void printChild(int i) {
		System.out.println(childs.get(i));
	}
	public void remove(MenuComponent menuComponent) {
		childs.remove(menuComponent);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(childs.iterator());
	}

	@Override
	public void print() {
		System.out.println(name);
		System.out.println("---------------------");
		Iterator<MenuComponent> iterator = childs.iterator();
		while(iterator.hasNext()) {
			iterator.next().print();
		}
	}

}

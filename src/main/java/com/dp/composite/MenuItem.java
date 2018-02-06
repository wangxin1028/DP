package com.dp.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private double price;
	
	public MenuItem(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

	@Override
	public void print() {
		System.out.println("MenuItem [name=" + name + ", description=" + description + ", price=" + price + "]");
	}

}

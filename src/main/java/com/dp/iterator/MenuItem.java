package com.dp.iterator;

public class MenuItem {
	private String name;
	private String description;
	private double price;
	
	public MenuItem(String name,String description,double price) {
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
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}

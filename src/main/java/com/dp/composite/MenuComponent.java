package com.dp.composite;

import java.util.Iterator;

public abstract class MenuComponent {
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void printChild(int i) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator<MenuComponent> createIterator();
	
	public abstract void print();
}

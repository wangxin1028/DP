package com.dp.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
	private Stack<Iterator<MenuComponent>> stack = new Stack<>();
	public CompositeIterator(Iterator<MenuComponent> iter) {
		stack.push(iter);
	}
	@Override
	public boolean hasNext() {
		if(!stack.isEmpty()) {
			Iterator<MenuComponent> iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
		return false;
	}

	@Override
	public MenuComponent next() {
		Iterator<MenuComponent> iterator = stack.peek();
		MenuComponent component = iterator.next();
		stack.push(component.createIterator());
		return component;
	}

}

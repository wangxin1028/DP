package com.dp.composite;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

	/**
	 * 叶子节点专用迭代对象
	 * 叶子节点没有子节点没有子节点，所以永远返回false
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

}

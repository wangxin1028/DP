package com.dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMenu implements Menu<MenuItem> {
	private List<MenuItem> items;
	public CoffeeMenu() {
		items = new ArrayList<>();
		addItem(new MenuItem("卡布奇诺", "一口浓情，一口咖啡", 13));
		addItem(new MenuItem("拿铁", "是哥们，就和拿铁", 11));
		addItem(new MenuItem("美式咖啡", "山姆大叔的最爱", 10));
		addItem(new MenuItem("猫屎咖啡", "大便做的，你懂得", 16));
		addItem(new MenuItem("牛栏山咖啡", "喝多了上头", 15));
	}
	
	private void addItem(MenuItem item) {
		items.add(item);
	}
	@Override
	public Iterator<MenuItem> iterator() {
		return new CoffeeMenuIterator();
	}
	
	public class CoffeeMenuIterator implements Iterator<MenuItem>{
		//这样写只是为了练习,其实不需要CoffeeMenuIterator，直接用ArrayList.Iterator就行了
		private java.util.Iterator<MenuItem> iter = items.iterator();
		
		@Override
		public boolean hasNext() {
			return iter.hasNext();
		}

		@Override
		public MenuItem next() {
			return iter.next();
		}
		
	}
}

package com.dp.templatemethod;

public class ThinkPad extends Computer {

	@Override
	public void welcomePage() {
		System.out.println("ThinkPad");
	}
	@Override
	public void hook() {
		System.out.println("windows经典开机声音");
	}
}

package com.dp.templatemethod;

public class Main {
	public static void main(String[] args) {
		Computer thinkpad = new ThinkPad();
		Computer macbook = new Macbook();
		
		thinkpad.powerOn();
		System.out.println("----------------");
		macbook.powerOn();
	}
}

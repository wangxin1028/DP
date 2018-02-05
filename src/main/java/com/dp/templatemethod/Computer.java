package com.dp.templatemethod;

public abstract class Computer {
	/**
	 * 模板方法
	 * 为了防止子类重写，定义成final的
	 */
	public final void powerOn() {
		power();
		check();
		biosInit();
		welcomePage();
		hook();
		homepage();
	}
	public void power() {
		System.out.println("通电");
	}
	public void check() {
		System.out.println("开机自检");
	}
	public void biosInit() {
		System.out.println("BIOS 引导程序加载");
	}
	public abstract void welcomePage();
	public void homepage() {
		System.out.println("进入桌面");
	}
	/**
	 * 钩子方法
	 *  1.做一些可选的逻辑
	 *  2.子类对模板方法中发生的一些事情做出反应
	 */
	public void hook() {}
}

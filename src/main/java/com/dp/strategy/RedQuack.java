package com.dp.strategy;
/**
 * 红鸭子带火飞,叽叽叫
 * @author wangxin
 *
 */
public class RedQuack extends Duck {
	public RedQuack() {
		this.flyBehavior = new FlyWithFire();
		this.quackBehavior = new JiJiQuack();
	}
	@Override
	public void display() {
		System.out.println("红鸭子");
	}

}

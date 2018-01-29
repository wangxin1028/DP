package com.dp.strategy;
/**
 * 
 * @author wangxin
 *
 */
public class RocketDuck extends Duck{
	public RocketDuck(){
		this.flyBehavior = new SupersonicFly();
		this.quackBehavior = new JiJiQuack();
	}
	
	@Override
	public void display() {
		System.out.println("火箭鸭");
	}

}

package com.dp.strategy;
/**
 * 绿鸭子呱呱叫,不会飞
 * @author wangxin
 *
 */
public class GreenDuck extends Duck{
	public GreenDuck(){
		this.flyBehavior = new NotFly();
		this.quackBehavior = new GuaGuaDuck();
	}
	
	@Override
	public void display() {
		System.out.println("绿鸭子");
	}

}

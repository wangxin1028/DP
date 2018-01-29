package com.dp.strategy;
/**
 * 一边飞一遍冒火
 * @author wangxin
 *
 */
public class FlyWithFire implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("冒火飞行");
	}

}

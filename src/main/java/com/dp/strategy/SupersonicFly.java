package com.dp.strategy;
/**
 * 超音速飞行
 * @author wangxin
 *
 */
public class SupersonicFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("超音速飞行");
	}

}

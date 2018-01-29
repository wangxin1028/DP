package com.dp.strategy;
/**
 * 叽叽叫
 * @author wangxin
 *
 */
public class JiJiQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("叽叽……");
	}

}

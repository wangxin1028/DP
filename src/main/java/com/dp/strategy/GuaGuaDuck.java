package com.dp.strategy;
/**
 * 呱呱叫
 * @author wangxin
 *
 */
public class GuaGuaDuck implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("呱呱……");
	}

}

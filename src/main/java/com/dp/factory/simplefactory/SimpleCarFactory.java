package com.dp.factory.simplefactory;
/**
 * 简单工厂模式 
 * 将创建对象的过程提取出来，从而在多个地方复用
 * @author wangxin
 *
 */
public class SimpleCarFactory {
	public Car createCar(String name) {
		if(name.equals("audi")) {
			return new AudiCar();
		}else if(name.equals("bmw")) {
			return new BMWCar();
		}
		return null;
	}
}

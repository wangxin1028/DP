package com.effective.server;
/**
 * 服务提供者模式
 * 四个组成部分：
 * 	服务接口(可选)
 * 	服务提供者接口
 * 	服务注册API
 * 	服务访问API
 * @author wangxin
 *
 */
public class Main {
	public static void main(String[] args) {
		CarServer.register("audi",new AudiFactory());
		CarServer.register("bmw",new BMWFactory());
		
		Car car = CarServer.getCar("audi");
		car.showBrand();
	}
}

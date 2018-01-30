package com.effective.server;

import java.util.Hashtable;
import java.util.Map;

public class CarServer {
	private static final Map<String,CarFactory> registerTable = new Hashtable<>();
	private static final String DEFULT_NAME = "DEFULT_NAME";

	public static void register(CarFactory carFactory) {
		registerTable.put(DEFULT_NAME, carFactory);
	}
	/**
	 * 服务注册API
	 * @param name
	 * @param carFactory
	 */
	public static void register(String name,CarFactory carFactory) {
		registerTable.put(name, carFactory);
	}
	/**
	 * 服务访问API
	 * @param name
	 * @return
	 */
	public static Car getCar(String name) {
		CarFactory factory = registerTable.get(name);
		if(null==factory) {
			throw new IllegalArgumentException("没有这个汽车品牌");
		}
		return factory.buildCar();
	}
	
	public static Car getCar() {
		return getCar(DEFULT_NAME);
	}
}

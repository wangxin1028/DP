package com.dp.factory.abstractfactory;

/**
 * @author wangxin
 *
 */
public interface MaterialFactory {
	public Steel getSteel();
	public Glass getGlass();
	public Leather getLeather();
}

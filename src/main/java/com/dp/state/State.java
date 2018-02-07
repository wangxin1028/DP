package com.dp.state;

public interface State {
	//投币
	public void insertQuarter();
	//退钱
	public void ejectQuarter();
	//摇杆
	public void turnCrank();
	//释放球
	public void dispense();
	//重新装填
	public void refill();
}

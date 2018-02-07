package com.dp.state;

public class NoQuarter implements State {
	private GumballMachine machine;
	
	public NoQuarter(GumballMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		machine.setCurrentState(machine.getHasQuarter());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("你都没投币，要我退什么钱！！");
	}

	@Override
	public void turnCrank() {
		System.out.println("大哥，先投币，谢谢！");
	}

	@Override
	public void dispense() {
		System.out.println("搞错了吧，根本都没有投币");
	}

	@Override
	public void refill() {
		
	}

	public String toString() {
		return "未投币";
	}
}

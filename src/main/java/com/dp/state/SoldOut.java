package com.dp.state;

public class SoldOut implements State {
	private GumballMachine machine;
	
	public SoldOut(GumballMachine machine){
		this.machine = machine;
	}

	@Override
	public void ejectQuarter() {
		System.out.println("兄弟，你搞错了");
	}

	@Override
	public void turnCrank() {
		System.out.println("兄弟，你搞错了");
	}

	@Override
	public void dispense() {
		System.out.println("兄弟，你搞错了");
	}

	@Override
	public void refill() {
		machine.setCurrentState(machine.getNoQuarter());

	}

	@Override
	public void insertQuarter() {
		System.out.println("现在没有球，投了也白投");
		
	}

	public String toString() {
		return "缺货";
	}
}

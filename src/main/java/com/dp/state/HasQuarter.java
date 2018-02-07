package com.dp.state;

public class HasQuarter implements State {
	private GumballMachine machine;
	
	public HasQuarter(GumballMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("已经投过了，你钱多是吧");
	}

	@Override
	public void ejectQuarter() {
		machine.setCurrentState(machine.getNoQuarter());
	}

	@Override
	public void turnCrank() {
		machine.setCurrentState(machine.getSold());

	}

	@Override
	public void dispense() {
		System.out.println("兄弟你搞错了");
	}

	@Override
	public void refill() {

	}

	@Override
	public String toString() {
		return "已投币";
	}

	
}

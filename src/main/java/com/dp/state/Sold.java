package com.dp.state;

public class Sold implements State {
	private GumballMachine machine;
	
	public Sold(GumballMachine machine){
		this.machine = machine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("先别急，正在服务上一个人呢");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("别急别急");
	}

	@Override
	public void turnCrank() {
		System.out.println("别摇了，你把它摇坏");
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if(machine.getCount()>0) {
			machine.setCurrentState(machine.getNoQuarter());
		}else {
			machine.setCurrentState(machine.getSoldOut());
		}
	}

	@Override
	public void refill() {

	}

	public String toString() {
		return "售卖中";
	}
}

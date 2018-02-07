package com.dp.state;

public class GumballMachine {
	private State soldOut;
	private State noQuarter;
	private State hasQuarter;
	private State sold;
	
	private State currentState;
	private int count;
	
	public GumballMachine(int count) {
		this.soldOut = new SoldOut(this);
		this.noQuarter = new NoQuarter(this);
		this.hasQuarter = new HasQuarter(this);
		this.sold = new Sold(this);
		
		this.count = count;
		if(count>0) {
			currentState = noQuarter;
		}else {
			currentState = soldOut;
		}
	}
	
	public State getSoldOut() {
		return soldOut;
	}
	public State getNoQuarter() {
		return noQuarter;
	}
	public State getHasQuarter() {
		return hasQuarter;
	}
	public State getSold() {
		return sold;
	}
	public State getCurrentState() {
		return currentState;
	}
	public int getCount() {
		return count;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public void insertQuarter(){
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}
	
	public void releaseBall() {
		System.out.println("出来一个球");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	void refill(int count) {
		this.count += count;
		System.out.println("重新装填了球: " + this.count);
		currentState.refill();
	}
	
}

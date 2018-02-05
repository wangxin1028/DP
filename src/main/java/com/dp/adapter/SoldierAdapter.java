package com.dp.adapter;

public class SoldierAdapter implements Soldier{
	private CityManagement cityManagerment;
	public SoldierAdapter(CityManagement cityManagerment) {
		this.cityManagerment = cityManagerment;
	}
	@Override
	public void combat() {
		cityManagerment.managetCity();
	}
	@Override
	public void train() {
		cityManagerment.study();
	}
	
}

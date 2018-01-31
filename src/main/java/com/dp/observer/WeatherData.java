package com.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> obs ;
	private int temperature;
	private int humidity;
	public WeatherData() {
		obs = new ArrayList<>();
	}
	@Override
	public void registObserver(Observer observer) {
		obs.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		obs.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : obs) {
			observer.update(temperature, humidity);
		}
	}
	
	public void setMeasurements(int temperature,int humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		notifyObserver();
	}

}

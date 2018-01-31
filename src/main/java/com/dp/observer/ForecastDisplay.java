package com.dp.observer;

public class ForecastDisplay implements Display, Observer {
	private int temperature;
	private int humidity;
	private WeatherData weatherData;
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registObserver(this);
	}
	public WeatherData getWeatherData() {
		return weatherData;
	}
	@Override
	public void update(int temperature, int humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("当前气温："+temperature+",当前湿度："+humidity);
	}

}

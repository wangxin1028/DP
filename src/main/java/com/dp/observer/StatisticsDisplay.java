package com.dp.observer;

public class StatisticsDisplay implements Display, Observer {
	private int maxTemperature = 0 ;
	private int maxHumidity = 0 ;
	private WeatherData weatherData;
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registObserver(this);
	}
	public WeatherData getWeatherData() {
		return weatherData;
	}
	@Override
	public void update(int temperature, int humidity) {
		if(temperature>maxTemperature) {
			this.maxTemperature = temperature;
		}
		if(humidity>maxHumidity) {
			this.maxHumidity = humidity;
		}
		display();
	}

	@Override
	public void display() {
		System.out.println("历史最高温:"+maxTemperature+",历史最大湿度："+maxHumidity);
	}

}

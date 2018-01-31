
package com.dp.observer;

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new ForecastDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(10, 50);
		weatherData.setMeasurements(5, 40);
		weatherData.setMeasurements(3, 30);
		weatherData.setMeasurements(20, 66);
		weatherData.setMeasurements(25, 75);
		weatherData.setMeasurements(30, 86);
	}
}

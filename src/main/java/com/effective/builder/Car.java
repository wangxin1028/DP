package com.effective.builder;

public class Car {
	private final String carName;
	private final double price;
	private final int doorCount;
	private final int seatCount;
	private final int speed;
	
	public static class Builder{
		//必填字段
		private final String carName;
		private final double price;
		
		//非必填字段
		private  int doorCount = 0;
		private  int seatCount = 0;
		private  int speed = 0;
		
		public Builder(String carName,double price) {
			this.carName = carName;
			this.price = price;
		}
		
		public Builder door(int doorCount) {
			this.doorCount = doorCount;
			return this;
		}
		
		public Builder seat(int seatCount) {
			this.seatCount = seatCount;
			return this;
		}
		
		public Builder speed(int speed) {
			this.speed = speed;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
		
	}
	
	private Car(Builder builder) {
		//可以做一些参数校验
		this.carName = builder.carName;
		this.price = builder.price;
		this.doorCount = builder.doorCount;
		this.seatCount = builder.seatCount;
		this.speed = builder.speed;
	}

	public String getCarName() {
		return carName;
	}

	public double getPrice() {
		return price;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", price=" + price + ", doorCount=" + doorCount + ", seatCount=" + seatCount
				+ ", speed=" + speed + "]";
	}
	
	
}

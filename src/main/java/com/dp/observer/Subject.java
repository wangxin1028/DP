package com.dp.observer;

public interface Subject {
	public void registObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
}

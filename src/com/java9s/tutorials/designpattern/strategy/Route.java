package com.java9s.tutorials.designpattern.strategy;

public interface Route {
	public void getDirections();
	public int getTotalDistance();
	public Enum<Traffic> getTraffic();
}

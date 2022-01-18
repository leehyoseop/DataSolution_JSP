package com.hyoseop.jan811.main;

public class Apple {
	private String a_location;
	private String a_color;
	private int a_price;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(String a_location, String a_color, int a_price) {
		super();
		this.a_location = a_location;
		this.a_color = a_color;
		this.a_price = a_price;
	}

	public String getA_location() {
		return a_location;
	}

	public void setA_location(String a_location) {
		this.a_location = a_location;
	}

	public String getA_color() {
		return a_color;
	}

	public void setA_color(String a_color) {
		this.a_color = a_color;
	}

	public int getA_price() {
		return a_price;
	}

	public void setA_price(int a_price) {
		this.a_price = a_price;
	}
	
}

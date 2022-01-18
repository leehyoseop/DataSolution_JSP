package com.hyoseop.jan173.jstlf;

import javax.xml.crypto.Data;

public class Snack {
	private String name;
	private int price;
	private Data exp;
	
	public Snack() {
		// TODO Auto-generated constructor stub
	}

	public Snack(String name, int price, Data exp) {
		super();
		this.name = name;
		this.price = price;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Data getExp() {
		return exp;
	}

	public void setExp(Data exp) {
		this.exp = exp;
	}
}

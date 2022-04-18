package com.alefuuuu.webfluxclienttutorial.domain;

public class Bill {
	
	private int number;
	private String description;
	private double price;
	
	
	
	public Bill() {
		
	}
	
	public Bill(int number, String description, double price) {
		super();
		this.number = number;
		this.description = description;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}

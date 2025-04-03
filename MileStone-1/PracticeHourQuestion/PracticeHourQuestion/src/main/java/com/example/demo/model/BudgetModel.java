package com.example.demo.model;

public class BudgetModel {
	private Integer userId;
	private String category;
	private double price;
	private Integer months;
	private double amount;
	
	public BudgetModel(Integer userId, String category, double price, Integer months, double amount) {
		super();
		this.userId = userId;
		this.category = category;
		this.price = price;
		this.months = months;
		this.amount = amount;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getMonths() {
		return months;
	}
	public void setMonths(Integer months) {
		this.months = months;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}

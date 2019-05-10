package com.capgemini.restaurant.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RestaurantHome {
	
	
	private int _id;
	private String dishName;
	private double price;
	private int quantity;

	public RestaurantHome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantHome(int orderId, String dishName, double price, int quantity) {
		super();
		this._id = orderId;
		this.dishName = dishName;
		this.price = price;
		this.quantity = quantity;
	}

	public int get_Id() {
		return _id;
	}

	public void set_Id(int orderId) {
		this._id = orderId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

package com.capgemini.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.restaurant.entity.RestaurantHome;


public interface RestaurantHomeService {
	public List<RestaurantHome> findAllOrders();
}

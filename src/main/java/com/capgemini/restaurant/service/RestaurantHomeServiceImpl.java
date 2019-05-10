package com.capgemini.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.restaurant.dao.RestaurantHomeDAO;
import com.capgemini.restaurant.entity.RestaurantHome;

@Service
public class RestaurantHomeServiceImpl implements RestaurantHomeService {

	
	@Autowired
	private RestaurantHomeDAO dao;
	@Override
	public List<RestaurantHome> findAllOrders() {
		System.out.println(dao.findAll());
		return dao.findAll();
	}

}

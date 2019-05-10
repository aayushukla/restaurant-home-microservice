package com.capgemini.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.restaurant.entity.RestaurantHome;
import com.capgemini.restaurant.service.RestaurantHomeService;

@RestController
@CrossOrigin("*")
public class RestaurantHomeController {

	@Autowired
	private RestaurantHomeService service;
	
	@GetMapping("/order")
	public ResponseEntity<List<RestaurantHome>> getAllRestaurants()
	{
		List<RestaurantHome> restaurant= service.findAllOrders();
		System.out.println(restaurant);
		return new ResponseEntity<List<RestaurantHome>>(restaurant, HttpStatus.OK);
	}
}

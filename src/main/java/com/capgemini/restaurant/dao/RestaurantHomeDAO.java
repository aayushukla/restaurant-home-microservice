package com.capgemini.restaurant.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.restaurant.entity.RestaurantHome;

@Repository
public interface RestaurantHomeDAO  extends MongoRepository<RestaurantHome, Integer> {

}

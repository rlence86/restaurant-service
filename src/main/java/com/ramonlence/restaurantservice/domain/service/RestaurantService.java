package com.ramonlence.restaurantservice.domain.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ramonlence.restaurantservice.domain.model.Restaurant;

@Service
public class RestaurantService {

	public List<Restaurant> findByName(String string) {
		return Collections.emptyList();
	}

}

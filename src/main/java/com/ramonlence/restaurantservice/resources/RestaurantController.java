package com.ramonlence.restaurantservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramonlence.restaurantservice.domain.model.Restaurant;
import com.ramonlence.restaurantservice.domain.service.RestaurantService;

@RestController
@RequestMapping("/v1/restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;

	public List<Restaurant> findByName(String string) {
		return restaurantService.findByName(string);
	}

}

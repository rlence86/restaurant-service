package com.ramonlence.restaurantservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramonlence.restaurantservice.domain.model.Restaurant;
import com.ramonlence.restaurantservice.domain.service.RestaurantService;

@RestController
@RequestMapping("/v1/restaurants")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;

	@GetMapping
	public List<Restaurant> findByName(@RequestParam("name") String string) {
		return restaurantService.findByName(string);
	}

}

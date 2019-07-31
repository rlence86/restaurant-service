package com.ramonlence.restaurantservice.domain.service;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.ramonlence.restaurantservice.domain.model.Restaurant;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantServiceTest {
	
	@InjectMocks
	private RestaurantService restaurantService;

	@Test
	public void testFindbyName() {
		List<Restaurant> restaurantsByName = restaurantService.findByName("name");
		assertEquals(Collections.emptyList(), restaurantsByName);
	}

}

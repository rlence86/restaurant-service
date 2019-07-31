package com.ramonlence.restaurantservice.resources;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ramonlence.restaurantservice.domain.model.Restaurant;
import com.ramonlence.restaurantservice.domain.service.RestaurantService;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantControllerTest {
	
	private static String RESTAURANT_NAME = "restaurantName";
	
	@InjectMocks
	private RestaurantController restaurantController;
	
	@Mock
	private RestaurantService restaurantService;

	@Test
	public void testFindByName() {
		List<Restaurant> expectedResult = Arrays.asList(Restaurant.builder().name(RESTAURANT_NAME).build());
		when(restaurantService.findByName(RESTAURANT_NAME)).thenReturn(expectedResult);
		List<Restaurant> restaurantsByName = restaurantController.findByName(RESTAURANT_NAME);
		assertEquals(expectedResult, restaurantsByName);
	}

}

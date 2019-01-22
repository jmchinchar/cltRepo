package com.techtalentsouth.cltRestaurants.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@GetMapping(value="/")
	public String index() {
		return "restaurant/index.html";
	}
	
		@GetMapping(value="/about")
	public String about() {
		return "restaurant/about-us.html";
	}
	
		@GetMapping(value="/contact")
	public String contact() {
		return "restaurant/contact-us.html";
		
	}
		
//		@PostMapping(value="/")
//		public String addNewRestaurant(Restaurant restaurant, Model model) {
//			restaurantRepository.save(restaurant);
//			model.addAttribute("restaurantName", restaurant.getRestaurantName());
//			model.addAttribute("imageUrl", restaurant.getImageUrl());
//			model.addAttribute("email", restaurant.getEmail());
//			return "restaurant/";
//		}
	
//		@PostMapping("/")
//	public List<Restaurant> retrieveAllRestaurants() {
//    return restaurantRepository.findAll();
//		}

}
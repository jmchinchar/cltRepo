package com.techtalentsouth.cltRestaurants.restaurant;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String restaurantName; 
	private String imageUrl;
	private String email;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String restaurantName, String imageUrl, String email) {
		super();
		this.restaurantName = restaurantName;
		this.imageUrl = imageUrl;
		this.email = email;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

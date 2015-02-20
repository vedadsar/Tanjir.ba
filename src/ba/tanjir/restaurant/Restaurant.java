package ba.tanjir.restaurant;

import java.util.ArrayList;
<<<<<<< HEAD

import ba.tanjir.restaurant.review.RestaurantReview;
=======
>>>>>>> 1624bb1feb3054dd2b2a80f9b4c73e9d1ea259ae
import ba.tanjir.user.*;

/**
 * This class represents restaurant on our service.
 * Its primary key will be PDVNumber that is unique for each restaurant.
 * This class will have all informations about this restaurant.
 * This class will have a administrator which will represent owner of restaurant.
 * Each restaurant may have more then one administrators.
 * Restaurants also have description, array list of rates ( which will be integers )
 * and array list of comments.
<<<<<<< HEAD
 * 
 * It has restaurant review. We'll see to remove review from this class and to have
 * class for all reviews and search for reviews from there. Still to decide.
=======
>>>>>>> 1624bb1feb3054dd2b2a80f9b4c73e9d1ea259ae
 * 
 * TODO Create all classes which are not created, and maybe separate them into "info" package.
 * 
 * @author vedadzornic
 *
 */
public class Restaurant {

	//@ID
	public String PDVNumber;
	public String restaurantName;
	public RestaurantAdministrator[] administrators;
	
	public String cityLocation;	
	public String adress;
	public Menu menu;
	public String workingTime;
	public String deliveryTime;
	public String orderTime;
<<<<<<< HEAD
	public int minOrder;	
	public String description;
	
	public RestaurantReview reviewOfRestaurant;
	
=======
	public int minOrder;
	
	public String description;
	public ArrayList<Integer> rating;
	public ArrayList<String> comments;
>>>>>>> 1624bb1feb3054dd2b2a80f9b4c73e9d1ea259ae
}

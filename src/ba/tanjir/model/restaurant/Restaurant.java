package ba.tanjir.model.restaurant;

import java.util.ArrayList;

import ba.tanjir.model.restaurant.review.RestaurantReview;
import ba.tanjir.model.user.RestaurantAdministrator;

/**
 * This class represents restaurant on our service.
 * Its primary key will be PDVNumber that is unique for each restaurant.
 * This class will have all informations about this restaurant.
 * This class will have a administrator which will represent owner of restaurant.
 * Each restaurant may have more then one administrators.
 * Restaurants also have description, array list of rates ( which will be integers )
 * and array list of comments.
 * 
 * It has restaurant review. We'll see to remove review from this class and to have
 * class for all reviews and search for reviews from there. Still to decide.
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
	public int minOrder;	
	public String description;
	
	public RestaurantReview reviewOfRestaurant;
	
	public ArrayList<Integer> rating;
	public ArrayList<String> comments;

	
	/**
	 * Static method we'll use to add restaurant into
	 * our database.
	 * @param r - restaurant to be added.
	 * @return boolean true if adding was successful or false if it was not.
	 */
	public static boolean addRestaurant(Restaurant r){
		return true;
	}
	
	/**
	 * Static method which we'll use to remove
	 * restaurant from our list. Searching restaurant will go
	 * with PDVNumber which is identical for each restaurant.
	 * @param PDVNumber primary key of restaurant we want to remove
	 * @return 
	 */
	public static boolean removeRestaurant(int PDVNumber){
		return true;
	}
	
	/**
	 * Method which will search in our database
	 * and return us restaurant with PDVNumber (PK)
	 * sent as parameter.
	 * @param PDVNumber
	 * @return
	 */
	public static Restaurant find(int PDVNumber){
		return null;		
	}
	
	/**
	 * Method for update of existing restaurant.
	 * TODO which parameters to use.
	 * @return
	 */
	public static boolean update(/* TO BE DECIDED */){
		return true;
	}
}

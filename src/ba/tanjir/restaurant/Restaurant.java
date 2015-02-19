package ba.tanjir.restaurant;

import ba.tanjir.user.User;

/**
 * This class represents restaurant on our service.
 * Its primary key will be PDVNumber that is unique for each restaurant.
 * This class will have all informations about this restaurant.
 * This class will have a administrator which will represent owner of restaurant.
 * Each restaurant may have more then one administrators.
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
	public User[] administrators;	//After creating two classes Customer, RestaurantOwner ( admin ) change this user --> ROwner.
	
	public String cityLocation;	
	public String adress;
	public Menu menu;
	public String workingTime;
	public String deliveryTime;
	public String orderTime;
	public int minOrder;
}

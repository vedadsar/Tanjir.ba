package ba.tanjir.orders;

import java.util.ArrayList;

import ba.tanjir.restaurant.Restaurant;
import ba.tanjir.restaurant.meal.Meal;
import ba.tanjir.user.Customer;

/**
 * Class which creates new order.
 * Each order has unique id and will be primary key in our db.
 * Order will have 
 * @author vedadzornic
 *
 */
public class Order {

	//@ID
	public int id;
	public Customer userOrdered;
	public Restaurant restaurant;
	public ArrayList<Meal> orderList;
	public double totalPrice;
	
	
	/**
	 * Static method which will create order.
	 */
	public static void createOrder(){
		
	}
}

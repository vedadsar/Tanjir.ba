package ba.tanjir.model.orders;

import java.util.ArrayList;

import ba.tanjir.model.restaurant.Restaurant;
import ba.tanjir.model.restaurant.meal.Meal;
import ba.tanjir.model.user.Customer;

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
	public ArrayList<Meal> cart;
	public double totalPrice;
	public Status orderStatus;
	
	
	/**
	 * Static method which will create order.
	 */
	public static void createOrder(ArrayList<Meal> cart){}
}

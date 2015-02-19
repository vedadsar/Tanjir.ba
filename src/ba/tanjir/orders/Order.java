package ba.tanjir.orders;

import java.util.ArrayList;

import ba.tanjir.restaurant.Meal;
import ba.tanjir.restaurant.Restaurant;
import ba.tanjir.user.Customer;

/**
 * Class which creates new order.
 * Each order has unique id and will be primary key in our db.
 * @author vedadzornic
 *
 */
public class Order {

	public int id;
	public Customer userOrdered;
	public Restaurant restaurant;
	public ArrayList<Meal> orderList;
	public double totalPrice;
	
}

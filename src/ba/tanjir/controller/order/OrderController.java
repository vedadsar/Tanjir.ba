package ba.tanjir.controller.order;

import java.util.ArrayList;

import ba.tanjir.model.restaurant.meal.*;
/**
 * Controller for orders.
 * Has several static methods which
 * control orders.
 * @author vedad
 *
 */
public class OrderController {

	/**
	 * Method for creating order.
	 * @param cart
	 */
	public static void createOrder(ArrayList<Meal> cart){}
	
	/**
	 * Method for updating status of order.
	 * Example once meal is delivered we update
	 * status to "Delivered"
	 * @see Status class from model order,
	 * @param statusID
	 */
	public static void updateStatus(int statusID) {}
	
	/**
	 * Method where user cann see status of order.
	 * @param orderID
	 */
	public static void checkStatus(int orderID){}
	
	
}

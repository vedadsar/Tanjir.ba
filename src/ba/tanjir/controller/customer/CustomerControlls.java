package ba.tanjir.controller.customer;

import ba.tanjir.model.orders.Order;
import ba.tanjir.model.restaurant.review.RestaurantReview;
import ba.tanjir.model.user.User;

/**
 * Class which contains all methods
 * which customer may use.
 * @author vedad
 *
 */
public class CustomerControlls {

	//Methods for editing users info
	public static void readUser(User id){}
	
	public static void updateUser (/**/){}
	
	//Methods for order
	public static void createOrder(Order o){}
	
	public static void readOrder(int order_id){}
	
	//Methods for review
	public static void createReview(RestaurantReview r){}
	
	public static void readReview(int review_id){}
	
	public static void updateReview(int review_id){}
	
	public static void deleteReview ( int review_ID) {}
	
	
}

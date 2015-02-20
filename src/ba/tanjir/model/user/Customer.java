package ba.tanjir.model.user;

import ba.tanjir.model.restaurant.meal.*;
import java.util.ArrayList;

/**
 * This class will represent our customer.
 * Extends user class and has additional variable
 * type of user which is final and same for all Customers = 0;
 * This type of user declares that our user is actually customer !
 * Also this class has int variable credits.
 * As user is created he  starts with 0 credits.
 * 
 * UPDATE added cart for each user. I found it useful to add it here
 * since each customer has own cart and at beggining its empty.
 * 
 * @author vedadzornic
 *
 */
public class Customer extends User {

	public final static int CUSTOMER_TYPE = 0;
	public int credits;
	public ArrayList<Meal> cart;
	
	public Customer(String email, String username, String password,
			 String name, String surname, String phoneNumber,
			String city, String adress) {
		
		super(email, username, password, CUSTOMER_TYPE, name, surname, phoneNumber,
				city, adress);		
		this.credits = 0;
		this.cart = null;
	
	}

}

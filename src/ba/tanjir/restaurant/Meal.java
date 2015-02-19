package ba.tanjir.restaurant;

import java.net.URL;

/**
 * This class creates meal. Each meal gets unique 
 * id which will be our primary key later in database.
 * It also have name, price which is double, description
 * and url to picture of meal.
 * @author vedadzornic
 *
 */
public class Meal {

	public int id;
	public String name;
	public double price;
	public String description;
	public URL imageURL;
	
	public Meal(int id, String name, double price, String description,
			URL imageURL) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageURL = imageURL;
	}	
}

package ba.tanjir.restaurant.meal;

import java.net.URL;
import java.util.LinkedList;

/**
 * This class creates meal. Each meal gets unique 
 * id which will be our primary key later in database.
 * It also have name, price which is double, description
 * and url to picture of meal.
 * Added list of portions and side dishes for meal.
 * TODO: if meal has no portions set default portion.
 * TODO: if meal has no side dishes to set default side dish.
 * TODO: methods to add/remove side dish from list, identical as methods
 * 		 for adding/removing portions.
 * @author vedadzornic
 *
 */
public class Meal {

	public int id;
	public String name;
	public double price;
	public String description;
	public URL imageURL;
	public LinkedList<Portions> portions;
	public LinkedList<SideDish> sideDishes;
	
	public Meal(int id, String name, double price, String description,
			URL imageURL, LinkedList<Portions> portions,
			LinkedList<SideDish> sideDishes) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageURL = imageURL;
		this.portions = portions;
		this.sideDishes = sideDishes;
	}
	
	/**
	 * Method for adding new portion into our portions of this meal.
	 * @param portion
	 */
	public void addPortion(Portions portion){
		portions.add(portion);
	}
	
	/**
	 * Method for removing portion from our meal portion list.
	 * @param id
	 */
	public void remvovePortion(int id){
		this.remvovePortion(id);
	}
	
}

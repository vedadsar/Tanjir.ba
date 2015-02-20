package ba.tanjir.model.restaurant.meal;

/**
 * This class will represent "porcije" on our service.
 * Portion have its name and additional price 
 * which will be added on total price of meal.
 * Each meal will be able to have either one ( basic ) portion
 * or more then 1.
 * @author vedad
 *
 */
public class Portions {

	public String name;
	public double additionalPrice;
	
	public Portions(String name, double additionalPrice) {
		this.name = name;
		this.additionalPrice = additionalPrice;
	}	
	
}

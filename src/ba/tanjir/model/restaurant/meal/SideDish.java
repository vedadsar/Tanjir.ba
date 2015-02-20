package ba.tanjir.model.restaurant.meal;

/**
 * Class which creates side dish on our meal.
 * It has name and additional price as option.
 * One meal will be able to select more then one side dishes.
 * @author vedad
 *
 */
public class SideDish {

	public String name;
	public double additionalPrice;
	
	/**
	 * Constructor where side dishes
	 * cost nothing.
	 * @param name
	 */
	public SideDish(String name){
		this.name = name;
		this.additionalPrice = 0;
	}
	
	/**
	 * Constructor if side dishes
	 * cost money.
	 * @param name
	 * @param additionalPrice
	 */
	public SideDish(String name, double additionalPrice){
		this.name = name;
		this.additionalPrice = additionalPrice;
	}
}

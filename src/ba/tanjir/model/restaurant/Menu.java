package ba.tanjir.model.restaurant;

import java.util.ArrayList;

import ba.tanjir.model.restaurant.meal.Meal;

/**
 * This class is creating menu of restaurant.
 * It will have methods to put meal in menu, and remove one from it.
 * @author vedadzornic
 *
 */
public class Menu {

	public int id;
	public ArrayList<Meal> meals;
	
	
	/**
	 * Constructor for creating  menu.
	 * @param meals
	 */
	public Menu(int id, ArrayList<Meal> meals){
		this.id = id;
		this.meals = meals;
	}
	
	public void addMeal(Meal meal){
		this.meals.add(meal);		
	}
	
	public void removeMeal(int mealID){
		meals.remove(mealID);
		//TODO how to find which meal we want to delete.
	}
}

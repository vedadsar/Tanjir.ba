package ba.tanjir.user;

/**
 * Class which simulates user of our service.
 * User can be either administrator or normal user ( customer ).
 * 
 * Administrator is not administrator of our service, it is owner
 * of restaurant. Administrator will have rights to edit his own 
 * restaurant info, including menu of his restaurant.
 * Administrator user will not be able to order foods.
 * 
 * Customer will have rights only to edit his own informations as
 * name, surname etc. and rights to order food. 
 * TODO create two classes Customer, Administrator which will extend this class.
 * TODO superAdmin class which will represent administrator of our service.
 * @author vedadzornic
 *
 */
public class User {

	// @ID
	public String email;
	public String username;
	public String password;
	public int typeOfUser;
	
	public String name;
	public String surname;
	public String phoneNumber;
	public String city;
	public String adress;
	
}

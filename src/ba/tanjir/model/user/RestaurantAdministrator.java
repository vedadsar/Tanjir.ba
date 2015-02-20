package ba.tanjir.model.user;

/**
 * This class creates owner of restaurant or its manager.
 * It extends class user and sends OWNER_TYPE as type of user constant.
 * Basically all users with type 1 will be admins and will have
 * rights to edit their restaurants.
 * @author vedadzornic
 *
 */
public class RestaurantAdministrator extends User{
	
	public static final int OWNER_TYPE = 1;
	
	public RestaurantAdministrator(String email, String username,
			String password, String name, String surname,
			String phoneNumber, String city, String adress) {
		
		super(email, username, password, OWNER_TYPE, name, surname, phoneNumber,
				city, adress);
		
	}

}

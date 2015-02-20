package ba.tanjir.model.user;

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
 * TODO fixing primary key ( email might be buggy )
 * TODO superAdmin class which will represent administrator of our service.
 * TODO create class UsersInfo which will contain all editable informations of user.
 * @author vedadzornic
 *
 */
public class User {

	// @ID
	public String email;
	public String username;
	public String password;	
	public final int TYPE_OF_USER;
	
	public String name;
	public String surname;
	public String phoneNumber;
	public String city;
	public String adress;
	
	/**
	 * Constructor for creating user.
	 * @param email
	 * @param username
	 * @param password
	 * @param name
	 * @param surname
	 * @param phoneNumber
	 * @param city
	 * @param adress
	 */
	public User(String email, String username, String password,
			int tYPE_OF_USER, String name, String surname, String phoneNumber,
			String city, String adress) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		TYPE_OF_USER = tYPE_OF_USER;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.adress = adress;
	}	
	
	
	/**
	 * Method for adding new user.
	 * @param u
	 * @return
	 */
	public static boolean addUser(User u){
		return true;
	}
	
	/**
	 * Method which removes existing user.
	 * TODO parameter which we'll use for primary key of user.
	 * @param email
	 * @return
	 */
	public static boolean removeUser(String email/* PK to be decided */){
		return true;
	}
	
	/**
	 * Method which search in our database for user.
	 * As parameter it receive users type ( restaurant admin or customer)
	 * and email of user (PK).
	 * @param TYPE_OF_USER
	 * @param email
	 * @return
	 */
	public static boolean find(int TYPE_OF_USER, String email){
		return true;
	}
	
	/**
	 * Method for updating user.
	 * @return
	 */
	public static boolean update(/*TODO*/){
		return true;
	}
}

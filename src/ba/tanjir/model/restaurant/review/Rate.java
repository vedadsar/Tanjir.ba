package ba.tanjir.model.restaurant.review;

import ba.tanjir.model.user.Customer;

/**
 * Class that creates single vote/rate.
 * It has user ( we'll change Customer into type of PK of customer class), 
 * customers comment and vote.
 * TODO votes must be 1-5.
 * @author vedadzornic
 *
 */
public class Rate {
	
	public Customer customerThatVoted;
	public String comment;
	public int vote;
	
}

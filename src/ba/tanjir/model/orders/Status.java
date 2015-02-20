package ba.tanjir.model.orders;

/**
 * Status of order.
 * In constructor has only 1 parameter
 * which is integer ( id of status).
 * Depending of status number we create
 * name of status.
 * @author vedad
 *
 */
public class Status {

	public int id;
	public String name;
	
	public Status(int statusID){
		this.id = statusID;
		
		if(statusID == 0)
			this.name = "Narudzba primljena.";
		else if(statusID == 1)
			this.name = "Narudzba na putu";
		else if(statusID == 2)
			this.name = "Isporuceno!";
		else if(statusID == 3)
			this.name = "NARUDZBA NE MOZE BITI ISPORUCENA";
		else
			System.err.println("Order status id is incorrect");
	}
}

package cs278.oasis.model;
import java.util.ArrayList;

/**
 * @author Hamilton Turner
 *
 */
public class Catalog {
	private ArrayList<School> schools_;
	private static Catalog instance;
	
	public ArrayList<School> getSchools() {
		return null;
	}
	
	public ArrayList<Department> getDepartments() {
		return null;
	}
	
	public static Catalog getInstance() {
		if (instance == null)
			instance = new Catalog();
		return instance;
	}
}

package cs278.oasis.model;
import java.util.ArrayList;

/**
 * @author Hamilton Turner
 *
 */
public class School {
	private String name;
	private String short_name;
	private ArrayList<Department> departments_;
	
	public School (String name, String short_name) {
		this.name = name;
		this.short_name = short_name;
	}
	
	public void addDepartment(Department d){
		
	}
	
	public void removeDepartment(Department d){
		
	}
}

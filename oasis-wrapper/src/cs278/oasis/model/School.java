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

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the short_name
	 */
	public String getShort_name() {
		return short_name;
	}

	/**
	 * @return the departments_
	 */
	public ArrayList<Department> getDepartments() {
		return departments_;
	}
}

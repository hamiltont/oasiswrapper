package cs278.oasis.model;
import java.util.ArrayList;

/**
 * @author Hamilton Turner
 *
 */
public class Department {
	private String short_name_;
	private String full_name_;
	private ArrayList<Course> courses_;
	
	public Department(String full_name, String short_name){
		
	}
	
	public String getShortName()
	{
		return short_name_;
	}
	
	public void setShortName(String name)
	{
		short_name_ = name;
	}
	
	public String getFullName()
	{
		return full_name_;
	}
	
	public void setFullName(String name)
	{
		full_name_ = name;
	}
	
	public ArrayList<Course> getCourses() 
	{
		return null;
	}
	
	public void addCourse(Course c) 
	{
		courses_.add(c);
	}
	
	public void removeCourse(Course c) 
	{
		courses_.remove(c);
	}
}

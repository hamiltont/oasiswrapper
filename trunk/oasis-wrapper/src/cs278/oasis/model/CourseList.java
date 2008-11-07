package cs278.oasis.model;

import java.util.ArrayList;

public class CourseList {

	private ArrayList<Course> courses_;
	private String name_;

	public ArrayList<Course> getCouses()
	{
		return courses_;
	}
	
	public void addCourse(Course c)
	{
		courses_.add(c);
	}
	
	public void removeCourse(Course c)
	{
		courses_.remove(c);
	}
	
	public int totalCreditHours()
	{	
		int hours = 0;
		for (int ii = 0; ii < courses_.size(); ii++)
			hours += courses_.get(ii).getCreditHours();
		
		return hours;
	}

	/**
	 * @param name_ the name_ to set
	 */
	public void setName(String name_) {
		this.name_ = name_;
	}

	/**
	 * @return the name_
	 */
	public String getName() {
		return name_;
	}
}


package cs278.oasis.test;

import cs278.oasis.model.Department;
import cs278.oasis.model.School;
import junit.framework.TestCase;

public class SchoolTest extends TestCase {

	public final void testSchool() {
		School school_ = new School("Engineering","ENG");
		assert("Engineering"==school_.getName());
		assert("ENG"==school_.getShort_name());
		
	}

	//Assumes constructor and getDepartments work
	public final void testAddDepartment() {
		Department d = new Department("Computer Science","CS");
		School school_ = new School("Engineering","ENG");
		school_.addDepartment(d);
		if(!school_.getDepartments().contains(d))
			fail("Department was not added");
		else {
			try{
				school_.addDepartment(d);
				fail("Department was added twice");
			}
			catch(Exception ex)
			{
				
			}
			
		}
			
	}
	
	//Assumes constructor, getDepartments, and addDepartments work
	public final void testRemoveDepartment() {
		Department d = new Department("Computer Science","CS");
		School school_ = new School("Engineering","ENG");
		school_.addDepartment(d);
		school_.removeDepartment(d);
		if(school_.getDepartments().contains(d))
			fail("Department was not removed");
		else {
			try{
				school_.removeDepartment(d);
				fail("Department was removed twice");
			}
			catch(Exception ex)
			{
				
			}
		}
		
	}


}
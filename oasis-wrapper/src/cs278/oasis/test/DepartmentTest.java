package cs278.oasis.test;

import java.util.ArrayList;
import java.util.HashMap;

import cs278.oasis.model.Course;
import cs278.oasis.model.Department;
import junit.framework.TestCase;

public class DepartmentTest extends TestCase {
	
	public void testAddCourse() 
	{
		Department d = this.getTestDepartment();
		Course c = new Course("Stevenson Hall","110A",4,d,"Louis" ,110, null,"Intro to Biology");
		
		// figure out how many courses are attached to the department
		Integer initialCount = d.getCourses().size();
		
		d.addCourse(c);
		
		// figure out how many courses are attached once we add one
		Integer finalCount = d.getCourses().size();
		
		assertTrue(finalCount == initialCount + 1);
	}
	
	public void testRemoveCourse() 
	{
		Department d = this.getTestDepartment();
		
		// figure out how many courses are attached to the department
		Integer initialCount = d.getCourses().size();
		
		d.removeCourse(d.getCourses().get(0));
		
		// figure out how many courses are attached once we add one
		Integer finalCount = d.getCourses().size();
		
		assertTrue(finalCount == initialCount - 1);
	}

	// Helper functions
	protected Department getTestDepartment()
	{
		Department d = new Department("Test Department","TE");
		Course c = new Course("Featheringill Hall","251",4,d,"Doug Schmidt",110,null,"Intro to Software Engineering");
		d.addCourse(c);
		
		return d;
	}
}

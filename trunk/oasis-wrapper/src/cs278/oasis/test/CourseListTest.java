package cs278.oasis.test;

import java.util.HashMap;

import cs278.oasis.model.Course;
import cs278.oasis.model.CourseList;
import cs278.oasis.model.Department;
import junit.framework.TestCase;

public class CourseListTest extends TestCase {

	//Assumes getcourses works
	public final void testAddCourse() {
		CourseList cl = new CourseList();
		Course c = new Course();
		cl.addCourse(c);
		if(!cl.getCouses().contains(c))
			fail("Course was not added");
		else
		{
			try{
				cl.addCourse(c);
				fail("Course added twice");
			}
			catch(Exception ex)
			{
			
			}
		}
		
	}

	//Assumes addcourse and getcourses work
	public final void testRemoveCourse() {
		CourseList cl = new CourseList();
		Course c = new Course();
		cl.addCourse(c);
		cl.removeCourse(c);
		if(cl.getCouses().contains(c))
			fail("Course was not removed");
		else
		{
			try{
				cl.removeCourse(c);
				fail("Course was removed twice");
			}
			catch(Exception ex)
			{
			
			}
		}
	}

	//Assumes addcourse and constructor work
	public final void testTotalCreditHours() {
		CourseList cl = new CourseList();
		assert(cl.totalCreditHours()==0);
		Course c1 = new Course("","",3,new Department("",""),"",1,new HashMap<String, String>(),"");
		cl.addCourse(c1);
		assert(cl.totalCreditHours()==3);
		Course c2 = new Course("","",3,new Department("",""),"",1,new HashMap<String, String>(),"");
		cl.addCourse(c2);
		assert(cl.totalCreditHours()==6);
		Course c3 = new Course("","",4,new Department("",""),"",1,new HashMap<String, String>(),"");
		cl.addCourse(c3);
		assert(cl.totalCreditHours()==10);
		Course c4 = new Course("","",5,new Department("",""),"",1,new HashMap<String, String>(),"");
		cl.addCourse(c4);
		assert(cl.totalCreditHours()==15);
		Course c5 = new Course("","",1,new Department("",""),"",1,new HashMap<String, String>(),"");
		cl.addCourse(c5);
		assert(cl.totalCreditHours()==16);
		Course c6 = new Course("","",0,new Department("",""),"",1,new HashMap<String, String>(),"");
		cl.addCourse(c6);
		assert(cl.totalCreditHours()==16);
	}

	//Assumes getname works
	public final void testSetName() {
		CourseList cl = new CourseList();
		cl.setName("BOB");
		assert(cl.getName()=="BOB");
	}

}

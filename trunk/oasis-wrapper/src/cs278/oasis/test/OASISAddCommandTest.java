package cs278.oasis.test;

import cs278.oasis.OASISConnection;
import cs278.oasis.commands.OASISAddCommand;
import cs278.oasis.model.Course;
import cs278.oasis.model.Department;
import junit.framework.TestCase;

public class OASISAddCommandTest extends TestCase {

	public void testRun() {
		OASISAddCommand oac = new OASISAddCommand();
		OASISConnection oConn = new OASISConnection();
		
		Course course_ = new Course();
		course_.setCourse_number("101");
		Department d = new Department("","PSY");
		course_.setParent(d);
		oac.toAdd = course_;
		
		if (!oac.run(oConn))
			fail("Course was not added"); 
	}

	public void testUnrun() {
		OASISAddCommand oac = new OASISAddCommand();
		OASISConnection oConn = new OASISConnection();
		
		Course course_ = new Course();
		course_.setCourse_number("101");
		Department d = new Department("","PSY");
		course_.setParent(d);
		oac.toAdd = course_;
		
		if (!oac.unrun(oConn))
			fail("Course was not added"); 
	}

}
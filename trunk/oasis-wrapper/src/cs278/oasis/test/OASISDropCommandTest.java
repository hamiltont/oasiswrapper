package cs278.oasis.test;

import cs278.oasis.OASISConnection;
import cs278.oasis.commands.OASISDropCommand;
import cs278.oasis.model.Course;
import cs278.oasis.model.Department;
import junit.framework.TestCase;

public class OASISDropCommandTest extends TestCase {

	public final void testRun() {
		OASISDropCommand odc = new OASISDropCommand();
		OASISConnection oConn = new OASISConnection();
		
		Course course_ = new Course();
		course_.setCourse_number("101");
		Department d = new Department("","PSY");
		course_.setParent(d);
		odc.toDrop = course_;
		
		if (!odc.run(oConn))
			fail("Course was not dropped"); 
	}

	public final void testUnrun() {
		OASISDropCommand odc = new OASISDropCommand();
		OASISConnection oConn = new OASISConnection();
		
		Course course_ = new Course();
		course_.setCourse_number("101");
		Department d = new Department("","PSY");
		course_.setParent(d);
		odc.toDrop = course_;
		
		if (!odc.run(oConn))
			fail("Course was not undropped"); 
	}

}

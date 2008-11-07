package cs278.oasis.test;

import cs278.oasis.OASISConnection;
import cs278.oasis.commands.OASISShowCoursesCommand;
import cs278.oasis.model.Department;
import junit.framework.TestCase;

public class OASISShowCoursesCommandTest extends TestCase {

	public final void testRun() {
		OASISConnection oConn = new OASISConnection();
		OASISShowCoursesCommand oscc = new OASISShowCoursesCommand();
		Department d = new Department("","PSY");
		oscc.toShow = d;
		
		if(!oscc.run(oConn))
			fail("Show Courses Command Failed");
		else if(oscc.data == null)
			fail("No data returned by Show Courses Command");
		
	}

	public final void testUnrun() {
		OASISConnection oConn = new OASISConnection();
		OASISShowCoursesCommand oscc = new OASISShowCoursesCommand();
		Department d = new Department("","PSY");
		oscc.toShow = d;
		
		if(!oscc.unrun(oConn))
			fail("Show Courses Command unrun Failed");
		
	}

}

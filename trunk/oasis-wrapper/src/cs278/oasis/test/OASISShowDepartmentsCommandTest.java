package cs278.oasis.test;

import cs278.oasis.OASISConnection;
import cs278.oasis.commands.OASISShowDepartmentsCommand;
import cs278.oasis.model.School;
import junit.framework.TestCase;

public class OASISShowDepartmentsCommandTest extends TestCase {

	public final void testRun() {
		OASISConnection oConn = new OASISConnection();
		OASISShowDepartmentsCommand osdc = new OASISShowDepartmentsCommand();
		School s = new School("", "A&S");
		osdc.toShow = s;
		
		if(!osdc.run(oConn))
			fail("Show Departments Command Failed");
		else if(osdc.data == null)
			fail("No data returned by Show Departments Command");
	}

	public final void testUnrun() {
		OASISConnection oConn = new OASISConnection();
		OASISShowDepartmentsCommand osdc = new OASISShowDepartmentsCommand();
		School s = new School("", "A&S");
		osdc.toShow = s;
		
		if(!osdc.unrun(oConn))
			fail("Show Departments Command unrun Failed");
	}

}

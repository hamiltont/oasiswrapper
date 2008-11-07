package cs278.oasis.test;

import cs278.oasis.OASISConnection;
import cs278.oasis.commands.OASISShowSchoolsCommand;
import junit.framework.TestCase;

public class OASISShowSchoolsCommandTest extends TestCase {

	public final void testRun() {
		OASISConnection oConn = new OASISConnection();
		OASISShowSchoolsCommand ossc = new OASISShowSchoolsCommand();
		
		if(!ossc.run(oConn))
			fail("Show Schools Command Failed");
		else if(ossc.data==null)
			fail("No data returned by Show Schools Command");
		
	}

	public final void testUnrun() {
		OASISConnection oConn = new OASISConnection();
		OASISShowSchoolsCommand ossc = new OASISShowSchoolsCommand();
		
		if(!ossc.unrun(oConn))
			fail("Show Schools Command unrun Failed");
	}

}

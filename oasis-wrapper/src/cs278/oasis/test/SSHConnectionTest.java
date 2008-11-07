package cs278.oasis.test;

import junit.framework.TestCase;
import cs278.oasis.SSHConnection;

public class SSHConnectionTest extends TestCase {
	
	SSHConnection connect = new SSHConnection();

	public void testRun() {
		assert(connect.run("test").equals(""));
	}

	public void testIs_connected() {
		assert(connect.is_connected());
	}

}

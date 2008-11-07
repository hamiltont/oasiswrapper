package cs278.oasis;
/**
 * 
 */

/**
 * @author Hamilton Turner
 *
 */
public class SSHConnection {
	
	private class SSHConnectionFailed extends Throwable {

	}
	
	private void connect() throws SSHConnectionFailed {
		if (Math.random() > 0.2)
			return;
		
		throw new SSHConnectionFailed(); 
	}
	
	public String run(String message) {
		return "";
	}
	
	public boolean is_connected() {
		return true;
	}
	
	private void disconnect()
	{
		
	}
	
}


package cs278.oasis.test;

import junit.framework.TestCase;
import cs278.oasis.*;
import cs278.oasis.commands.OASISAddCommand;
import cs278.oasis.commands.OASISCommand;

public class OASISConnectionTest extends TestCase {

	OASISConnection connect = new OASISConnection();
	
	public void testOASISConnection() {
		assert(connect != null);
	}

	public void testGetSettings() {
		//assumes that setSettings() is working correctly
		ConnectionSettings settings = new ConnectionSettings();
		connect.setSettings(settings);
		assert(connect.getSettings() == settings);
	}

	public void testSetSettings() {
		//assumes that getSettings() is working correctly
		ConnectionSettings settings = new ConnectionSettings();
		connect.setSettings(settings);
		assert(connect.getSettings() == settings);
	}

	public void testConnect() {
		//assumes that isConnected() works
		connect.connect();
		assert(connect.isConnected_());
	}

	public void testDisconnect() {
		//assumes that isConnected() works
		connect.disconnect();
		assert(!connect.isConnected_());
	}

	public void testExecute() {
		OASISAddCommand add = new OASISAddCommand();
		
		try
		{
			connect.execute(add);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void testIsConnected()
	{
		connect.connect();
		assert(connect.isConnected_());
		connect.disconnect();
		assert(connect.isConnected_());
	}
	
	public void testWrite()
	{
	}
}

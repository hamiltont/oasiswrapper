package cs278.oasis;

import cs278.oasis.commands.*;

public class OASISConnection {
	
	protected ConnectionSettings settings_;
	private boolean isConnected_ = false;
	
	public OASISConnection()
	{
	}
	
    public ConnectionSettings getSettings()
    {
    	return settings_;
    }
    
    public void setSettings(ConnectionSettings settings)
    {
    	settings_ = settings;
    }
    
	public void connect()
	{
		
	}
	
	public void disconnect()
	{
		
	}
	
	public void execute(OASISCommand command)
	{
		command.run(this);
	}

	/**
	 * @return the isConnected_
	 */
	public boolean isConnected_() {
		return isConnected_;
	}
	
	public void write(String oasiscmd)
	{
		
	}

}

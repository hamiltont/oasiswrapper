package cs278.oasis;

import java.util.HashMap;

 class ConnectionSettings {
	protected HashMap<Object, String> properties_;

	public void loadFromFile(String path)
	{
		// do some sort of unserialization to load the data from a file
	}
	
	public void saveToFile(String path)
	{
		// do some sort of serialization here
	}
	
	public HashMap<Object, String> getProperties()
	{
		return properties_;
	}
	
	public void setProperties(HashMap<Object, String> newProperties)	
	{
		properties_ = newProperties;
	}
	
	public Object propertyForKey(String key)
	{
		return properties_.get(key);
	}
}

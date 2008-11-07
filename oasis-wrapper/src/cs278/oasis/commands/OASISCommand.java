package cs278.oasis.commands;
import cs278.oasis.model.*;
import cs278.oasis.*;

public interface OASISCommand {
	
	// returns true if running the command was successful
	public boolean run(OASISConnection connection);

	// returns true if undoing the command was successful
	public boolean unrun(OASISConnection connection);

}
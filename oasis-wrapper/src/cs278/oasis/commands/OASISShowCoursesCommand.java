package cs278.oasis.commands;
import java.util.ArrayList;

import cs278.oasis.model.*;
import cs278.oasis.*;

public class OASISShowCoursesCommand implements OASISCommand {

	public Department toShow;
	public ArrayList<Course> data;
	
	public boolean run(OASISConnection connection) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean unrun(OASISConnection connection) {
		// Nothing to undo!
		return true;
	}

}

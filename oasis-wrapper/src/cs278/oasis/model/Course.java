package cs278.oasis.model;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Hamilton Turner
 *
 */
public class Course {
	private String title_;
	private Department parent;
	private String course_number_;
	private String building_;
	private Integer room_number_;
	private HashMap<String, String> schedule_;  // should probably turn this into 
									   //  <string, TimeWindow>
	private String professor_;
	private Integer credit_hours;
	
	/**
	 * @return the title_
	 */
	public String getTitle() {
		return title_;
	}
	
	
	/**
	 * @param title_ the title_ to set
	 */
	public void setTitle(String title_) {
		this.title_ = title_;
	}

	
	
	/**
	 * @return the course_number_
	 */
	public String getCourse_number() {
		return course_number_;
	}
	
	
	/**
	 * @param course_number_ the course_number_ to set
	 */
	public void setCourse_number(String course_number_) {
		this.course_number_ = course_number_;
	}
	
	
	/**
	 * @return the building_
	 */
	public String getBuilding() {
		return building_;
	}
	
	
	/**
	 * @param building_ the building_ to set
	 */
	public void setBuilding(String building_) {
		this.building_ = building_;
	}
	
	
	/**
	 * @return the room_number_
	 */
	public Integer getRoom_number() {
		return room_number_;
	}
	
	
	/**
	 * @param room_number_ the room_number_ to set
	 */
	public void setRoom_number(Integer room_number_) {
		this.room_number_ = room_number_;
	}
	
	
	/**
	 * @return the schedule_
	 */
	public HashMap<String, String> getSchedule() {
		return schedule_;
	}
	
	
	/**
	 * @param schedule_ the schedule_ to set
	 */
	public void setSchedule(HashMap<String, String> schedule_) {
		this.schedule_ = schedule_;
	}
	
	
	/**
	 * @return the professor_
	 */
	public String getProfessor() {
		return professor_;
	}
	
	
	/**
	 * @param professor_ the professor_ to set
	 */
	public void setProfessor(String professor_) {
		this.professor_ = professor_;
	}	
	
	/**
	 * @return the credit_hours_
	 */
	public Integer getCreditHours() {
		return credit_hours;
	}
	
	
	/**
	 * @param credit_hours_ the credit_hours_ to set
	 */
	public void setCreditHours(Integer credit_hours_) {
		this.credit_hours = credit_hours_;
	}


	/**
	 * @param parent the parent to set
	 */
	public void setParent(Department parent) {
		this.parent = parent;
	}


	/**
	 * @return the parent
	 */
	public Department getParent() {
		return parent;
	}
	
}

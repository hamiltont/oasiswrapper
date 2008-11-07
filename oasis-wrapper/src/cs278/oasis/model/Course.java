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
	
	public Course(String building_, String course_number_,
			Integer credit_hours, Department parent, String professor_,
			Integer room_number_, HashMap<String, String> schedule_,
			String title_) {
		super();
		this.building_ = building_;
		this.course_number_ = course_number_;
		this.credit_hours = credit_hours;
		this.parent = parent;
		this.professor_ = professor_;
		this.room_number_ = room_number_;
		this.schedule_ = schedule_;
		this.title_ = title_;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return title_;
	}
	
	public void setTitle(String title_) {
		this.title_ = title_;
	}

	public String getCourse_number() {
		return course_number_;
	}
	
	public void setCourse_number(String course_number_) {
		this.course_number_ = course_number_;
	}
	
	public String getBuilding() {
		return building_;
	}
	
	public void setBuilding(String building_) {
		this.building_ = building_;
	}
	
	public Integer getRoom_number() {
		return room_number_;
	}
	
	public void setRoom_number(Integer room_number_) {
		this.room_number_ = room_number_;
	}
	
	public HashMap<String, String> getSchedule() {
		return schedule_;
	}
	
	public void setSchedule(HashMap<String, String> schedule_) {
		this.schedule_ = schedule_;
	}
	
	public String getProfessor() {
		return professor_;
	}
	
	public void setProfessor(String professor_) {
		this.professor_ = professor_;
	}	
	
	public Integer getCreditHours() {
		return credit_hours;
	}
	
	public void setCreditHours(Integer credit_hours_) {
		this.credit_hours = credit_hours_;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public Department getParent() {
		return parent;
	}
	
}

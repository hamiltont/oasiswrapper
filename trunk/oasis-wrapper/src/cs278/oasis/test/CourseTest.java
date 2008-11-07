package cs278.oasis.test;

import java.util.HashMap;

import cs278.oasis.model.Course;
import cs278.oasis.model.Department;
import junit.framework.TestCase;

public class CourseTest extends TestCase {

	public void testGetTitle() {
		Course c = new Course();
		assertNull(c.getTitle());
		
		c.setTitle("test");
		assertEquals("test",c.getTitle());
	}

	public void testSetTitleString() {
		Course c = new Course();
		assertNull(c.getTitle());
		
		c.setTitle("test");
		assertEquals("test",c.getTitle());
	}

	public void testGetCourse_number() {
		Course c = new Course();
		assertNull(c.getCourse_number());
		
		c.setCourse_number("155A");
		assertEquals("155A",c.getCourse_number());
	}

	public void testSetCourse_number() {
		Course c = new Course();
		assertNull(c.getCourse_number());
		
		c.setCourse_number("155A");
		assertEquals("155A",c.getCourse_number());
	}

	public void testGetBuilding() {
		Course c = new Course();
		assertNull(c.getBuilding());
		
		c.setBuilding("FGH");
		assertEquals("FGH",c.getBuilding());
	}

	public void testSetBuilding() {
		Course c = new Course();
		assertNull(c.getBuilding());
		
		c.setBuilding("FGH");
		assertEquals("FGH",c.getBuilding());
	}

	public void testGetRoom_number() {
		Course c = new Course();
		assertNull(c.getRoom_number());
		
		c.setRoom_number(134);
		assertEquals(new Integer(134), c.getRoom_number());
	}

	public void testSetRoom_number() {
		Course c = new Course();
		assertNull(c.getRoom_number());
		
		c.setRoom_number(134);
		assertEquals(new Integer(134), c.getRoom_number());
	}

	public void testGetSchedule() {
		Course c = new Course();
		assertNull(c.getSchedule());
		
		HashMap<String, String> hm = new HashMap<String, String>();
		c.setSchedule(hm);
		assertEquals(hm, c.getSchedule());
	}

	public void testSetSchedule() {
		Course c = new Course();
		assertNull(c.getSchedule());
		
		HashMap<String, String> hm = new HashMap<String, String>();
		c.setSchedule(hm);
		assertEquals(hm, c.getSchedule());
	}

	public void testGetProfessor() {
		Course c = new Course();
		assertNull(c.getProfessor());
		
		c.setProfessor("Doug Schmidt");
		assertEquals("Doug Schmidt", c.getProfessor());
	}

	public void testSetProfessor() {
		Course c = new Course();
		assertNull(c.getProfessor());
		
		c.setProfessor("Doug Schmidt");
		assertEquals("Doug Schmidt", c.getProfessor());
	}

	public void testGetCreditHours() {
		Course c = new Course();
		assertNull(c.getCreditHours());
		
		c.setCreditHours(5);
		assertEquals(new Integer(5), c.getCreditHours());
	}
	
	public void testSetCreditHours() {
		Course c = new Course();
		assertNull(c.getCreditHours());
	
		c.setCreditHours(5);
		assertEquals(new Integer(5), c.getCreditHours());
	}

	public void testSetParent() {
		Department d = new Department("boo", "boo");
		Course c = new Course();
		assertNull(c.getParent());
	
		c.setParent(d);
		assertEquals(d, c.getParent());
	}
	
	public void testGetParent() {
		Department d = new Department("boo", "boo");
		Course c = new Course();
		assertNull(c.getParent());
	
		c.setParent(d);
		assertEquals(d, c.getParent());
	}
}

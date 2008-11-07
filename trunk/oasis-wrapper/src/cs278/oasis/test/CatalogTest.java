package cs278.oasis.test;

import cs278.oasis.model.Catalog;
import cs278.oasis.model.School;
import cs278.oasis.model.Department;
import java.util.ArrayList;

import junit.framework.TestCase;

public class CatalogTest extends TestCase {

	public void testGetSchools() {
		Catalog c = this.getTestCatalog();
		assertNotNull(c);
		
		ArrayList<School> s = null;
		
		s = c.getSchools();
		assertNotNull(s);
	}

	public void testGetDepartments() {
		Catalog c = this.getTestCatalog();
		assertNotNull(c);
		
		ArrayList<Department> d = null;
		
		d = c.getDepartments();
		assertNotNull(d);
	}

	public void testGetInstance() {
		Catalog c = null;
		assertNull(c);
		
		c = Catalog.getInstance();
		assertNotNull(c);
		
		for (int i = 0; i < 500; i++){
			assertEquals(Catalog.getInstance(), Catalog.getInstance());
		}
	}

	private Catalog getTestCatalog() {
		return Catalog.getInstance();
	}
	
}

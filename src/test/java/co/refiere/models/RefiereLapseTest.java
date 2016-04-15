package co.refiere.models;

import org.junit.Test;

import co.refiere.dao.RefiereLapseDao;

public class RefiereLapseTest {

	@Test
	public void testCreateRefiereLapse() {

		RefiereLapseDao refiereDao = new RefiereLapseDao();
		RefiereLapse newLapse = new RefiereLapse();
		newLapse.setName("Testing lapse");
		newLapse.setDays(1);
		
		refiereDao.save(newLapse);

	}
}

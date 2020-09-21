package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EncapsulateTheDataTest {
	EncapsulateTheData test = new EncapsulateTheData();
	
	@Test
	public void testItemsReceived() {
		
		test.setItemsReceived(5);
		assertEquals(5, test.getItemsReceived());
		
		test.setItemsReceived(-2);
		assertEquals(0, test.getItemsReceived());
	}
	
	@Test
	public void testDegreesTurned() {
		
		test.setDegreesTurned(40);
		assertEquals(40, test.getDegreesTurned());
		
		test.setDegreesTurned(370);
		assertEquals(40, test.getDegreesTurned());
	}
	
	@Test
	public void testNomenclature() {
		
		test.setNomenclature("CaO");
		assertEquals("CaO", test.getNomenclature());
		
		test.setNomenclature(" ");
		assertEquals("CaO", test.getNomenclature());
	}
	
	@Test
	public void testObject() {
		
		Object newObj = new Object();
		test.setMemberObj(newObj);
		assertEquals(newObj, test.getMemberObj());
		
		String newString = new String();
		test.setMemberObj(newString);
		assertFalse(test.getMemberObj().getClass().equals(String.class));
	}
}

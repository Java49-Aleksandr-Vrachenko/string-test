package telran.hw.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testCharAt() {
		/*The charAt() method returns the character at a specified index (position) in a string.*/
		assertEquals('T',"TypeScript".charAt(0));
		assertEquals('S',"TypeScript".charAt(4));
		assertEquals('i',"TypeScript".charAt(7));
		assertEquals('t',"TypeScript".charAt(9));
	}
	@Test
	void testCompareTo() {
		/*The method returns 0 if the string is equal to the other string. A value less than 0 
		 * is returned if the string is less than the other string (less characters) and a value
		 *  greater than 0 if the string is greater than the other string (more characters)*/
		assertEquals(0,"HTML".compareTo("HTML"));
		assertTrue("HTML".compareTo("JavaScript")<0);
		assertFalse("HTML".compareTo("JavaScript")>0);
	}
	@Test
	void testCompareToIgnoreCase() {
		/*The method returns 0 if the string is equal to the other string, ignoring case
		 *  differences. A value less than 0 is returned if the string is less than the other 
		 *  string (less characters) and a value greater than 0 if the string is greater than 
		 *  the other string (more characters)*/
		assertEquals(0,"typescript".compareToIgnoreCase("TypeScript"));
		assertTrue("Java".compareToIgnoreCase("JavaScript")<0);
		assertFalse("Java".compareToIgnoreCase("JavaScript")>0);
	}
	@Test
	void testConcat() {
		/*The concat() method appends (concatenate) a string to the end of another string.*/
		assertEquals("JavaScript","Java".concat("Script"));
		assertEquals("TypeScript","Type".concat("Script"));
	}
	@Test 
	void testStartWith() {
		/*The startsWith() method checks whether a string starts with the specified character(s).
		 * Returns:	A boolean value:
					true - if the string starts with the specified character(s)
					false - if the string does not start with the specified character(s)*/
		assertEquals(true,"Java".startsWith("J"));
		assertEquals(false,"Java".startsWith("v"));
	}
	@Test
	void testEndWith() {
		/*The endsWith() method checks whether a string ends with the specified character(s).
		 * Returns:	A boolean value:
					true - if the string ends with the specified character(s)
					false - if the string does not end with the specified character(s)*/
		assertEquals(true,"Java".endsWith("a"));
		assertEquals(false,"Java".endsWith("J"));
	}
	@Test
	void testContains() {
		/*The contains() method checks whether a string contains a sequence of characters.
		 * Returns true if the characters exist and false if not.*/
		assertEquals(true,"Hello".contains("Hel"));
		assertEquals(true,"Hello".contains("llo"));
		assertEquals(false,"Hello".contains("lolo"));
	}
	@Test
	void testIndexOf() {
		/*The indexOf() method returns the position of the first occurrence of specified character(s) in a string*/
		assertEquals(0,"TypeScript".indexOf("Typ"));
		assertEquals(-1,"TypeScript".indexOf("hel"));
		assertEquals(8,"TypeScript".indexOf("pt"));
		assertEquals(2,"TypeScript".indexOf("p"));
	}
	@Test
	void testLastIndexOf() {
		/*The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string*/
		assertEquals(0,"TypeScript".lastIndexOf("Typ"));
		assertEquals(4,"TypeScript".lastIndexOf("Scr"));
		assertEquals(15,"TypeScript JavaScript CSS HTML".lastIndexOf("Script"));
	}
	

}

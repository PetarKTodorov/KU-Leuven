package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * This JUnit test class tests the bracket parser
 *
 * @author Jeroen Wauters
 */
public class BracketParserTest {

	BracketParserIntf parser;

	@Test
	public void testCheckBrackets() {
		parser = new BracketParser();

		assertTrue(parser.checkBrackets("()"));
		assertTrue(parser.checkBrackets("([])"));
		assertTrue(parser.checkBrackets("([]{}<>)"));
		assertFalse(parser.checkBrackets("({)}"));
		assertFalse(parser.checkBrackets("(()"));
		assertTrue(parser.checkBrackets("(a + {5 - 8})-3"));
		assertFalse(parser.checkBrackets("())"));
	}

}

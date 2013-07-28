import junit.framework.TestCase;


public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertEquals(true, Character.isWhitespace('\n'));
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace(' '));
	}
	
	public void testCharacterIdentifier() throws Exception {
		assertEquals(true, Character.isJavaIdentifierPart('$'));
		assertEquals(true, Character.isJavaIdentifierPart('_'));
		assertEquals(false, Character.isJavaIdentifierPart('^'));
		assertEquals(true, Character.isJavaIdentifierPart('7'));
		assertEquals(false, Character.isJavaIdentifierPart(' '));
	}
	
}

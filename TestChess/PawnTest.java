import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn pawn = new Pawn("white");
		
		String color = pawn.getColor();
		assertEquals("white", color);
		
		Pawn pawn2 = new Pawn("black");
		color = pawn2.getColor();
		assertEquals("black", color);
	}
}

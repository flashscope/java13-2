import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {

		String white = "white";
		String black = "black";

		
		//Error!
		/*
		Pawn pawnNoColor = new Pawn();
		String color = pawnNoColor.getColor();
		assertEquals(white, color);
		*/
		
		//add white
		Pawn pawnNoColor = new Pawn(white);
		String color = pawnNoColor.getColor();
		assertEquals(white, color);
		
		
	}
}

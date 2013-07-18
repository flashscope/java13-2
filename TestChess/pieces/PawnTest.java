package pieces;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {

		
		//Error!
		/*
		Pawn pawnNoColor = new Pawn();
		String color = pawnNoColor.getColor();
		assertEquals(white, color);
		*/
		
		//add white
		Pawn pawnWhite = new Pawn(Pawn.PAWN_WHITE,'p');
		String color = pawnWhite.getColor();
		assertEquals(Pawn.PAWN_WHITE, color);
		
		
	}
}

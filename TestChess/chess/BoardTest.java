package chess;
import pieces.Pawn;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	public void testBoard() throws Exception {
		Board board = new Board();
		
		Pawn pawnWhite = new Pawn(Pawn.PAWN_WHITE);
		board.addPawn(pawnWhite);
		assertEquals(1, board.getPawnSize());
		assertTrue(board.getPawnList().contains(pawnWhite));
		
		Pawn pawnBlack = new Pawn(Pawn.PAWN_BLACK);
		board.addPawn(pawnBlack);
		assertEquals(2, board.getPawnSize());
		assertTrue(board.getPawnList().contains(pawnBlack));
		
		
	}
}

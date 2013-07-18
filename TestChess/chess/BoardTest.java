package chess;
import pieces.Pawn;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	public void testBoard() throws Exception {
		Board board = new Board();
		assertEquals(2, board.getPawnSize());
		
		Pawn pawnWhite = new Pawn(Pawn.PAWN_WHITE,'p');
		board.addPawn(pawnWhite);
		assertEquals(3, board.getPawnSize());
		assertTrue(board.getPawnList().contains(pawnWhite));
		
		Pawn pawnBlack = new Pawn(Pawn.PAWN_BLACK,'P');
		board.addPawn(pawnBlack);
		assertEquals(4, board.getPawnSize());
		assertTrue(board.getPawnList().contains(pawnBlack));
		
	}
}

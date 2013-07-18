package chess;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	public void testBoard() throws Exception {
		Board board = new Board();
		assertEquals(16, board.getPawnSize());
		board.printBoard();
	}
}

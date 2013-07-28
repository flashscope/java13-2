package chess;

import static pieces.Piece.Type.*;
import static pieces.Piece.Color.*;
import pieces.Piece;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	static final String EMPTY_ROW = "........";
	
	private Board board;
	
	@Override
	protected void setUp() throws Exception {
		Piece.resetCountPieces();
		board = new Board();
	}
	/*
	public void testCreate() throws Exception {
		assertEquals(RowTest.WHITE_PAWN_ROW, board.printRow(1));
		assertEquals(RowTest.BLACK_PAWN_ROW, board.printRow(6));
	}
	
	public void testPrint() throws Exception {
		String expected = 
			RowTest.BLACK_EXCEPT_PAWN_ROW + Board.NEW_LINE +
			RowTest.BLACK_PAWN_ROW + Board.NEW_LINE +
			createEmptyRow() + 
			createEmptyRow() + 
			createEmptyRow() + 
			createEmptyRow() +
			RowTest.WHITE_PAWN_ROW + Board.NEW_LINE +
			RowTest.WHITE_EXCEPT_PAWN_ROW + Board.NEW_LINE;
		
		assertEquals(expected, board.print());
		System.out.println(board.print());
	}
	*/
	private String createEmptyRow() {
		return EMPTY_ROW + Board.NEW_LINE;
	}
	
	public void testCountPieces() throws Exception {
		assertEquals(0, Piece.countWhitePieces());
		assertEquals(0, Piece.countBlackPieces());
	}
	
	public void testCount() throws Exception {
		assertEquals(0, board.getCount(WHITE,PAWN));
	}
	
	/*
	public void testGetPieceByPosition() throws Exception {
		assertEquals(Piece.createBlackRook(), board.getPieceByPosition("h8"));
	}
	*/
	
	public void testSetPieceByPosition() throws Exception {
		setBoardForScoreCount();
		
		assertEquals(Piece.createBlackQueen(), board.getPieceByPosition("e6"));
		System.out.println(board.print());
	}
	
	public void testWhiteScore() throws Exception {
		setBoardForScoreCount();
		assertEquals(19.5, board.getScoreWhite());
	}
	
	public void testBlackScore() throws Exception {
		setBoardForScoreCount();
		assertEquals(20.0, board.getScoreBlack());
	}
	
	private void setBoardForScoreCount(){
		board.setPieceByPosition("a7",Piece.createBlackPawn());
		board.setPieceByPosition("b8",Piece.createBlackKing());
		board.setPieceByPosition("b6",Piece.createBlackPawn());
		board.setPieceByPosition("c8",Piece.createBlackRook());
		board.setPieceByPosition("c7",Piece.createBlackPawn());
		board.setPieceByPosition("d7",Piece.createBlackBishop());
		
		board.setPieceByPosition("e6",Piece.createBlackQueen());
		board.setPieceByPosition("e1",Piece.createWhiteRook());
		
		board.setPieceByPosition("f4",Piece.createWhiteKnight());
		board.setPieceByPosition("f3",Piece.createWhitePawn());
		board.setPieceByPosition("f2",Piece.createWhitePawn());
		board.setPieceByPosition("f1",Piece.createWhiteKing());
		
		board.setPieceByPosition("g4",Piece.createWhiteQueen());
		board.setPieceByPosition("g2",Piece.createWhitePawn());
		board.setPieceByPosition("h3",Piece.createWhitePawn());
	}
	
}

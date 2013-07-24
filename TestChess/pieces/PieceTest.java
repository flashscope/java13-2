package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() throws Exception {
		verifyCreation(Piece.createWhitePawn(), Piece.createBlackPawn(),
				Piece.pieceType.PAWN, 'p');
		
		verifyCreation(Piece.createWhiteRook(), Piece.createBlackRook(),
				Piece.pieceType.ROOK, 'r');
		
		verifyCreation(Piece.createWhiteKnight(), Piece.createBlackKnight(),
				Piece.pieceType.KNIGHT, 'n');
		
		verifyCreation(Piece.createWhiteBishop(), Piece.createBlackBishop(),
				Piece.pieceType.BISHOP, 'b');
		
		verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(),
				Piece.pieceType.QUEEN, 'q');
		
		verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(),
				Piece.pieceType.KING, 'k');
		
	}

	private void verifyCreation(Piece whitePiece, Piece blackPiece,
			Piece.pieceType type, char representation) {
		assertTrue(whitePiece.isWhite());
		assertEquals(type, whitePiece.getType());
		assertEquals(representation, whitePiece.getShow());

		assertTrue(blackPiece.isBlack());
		assertEquals(type, blackPiece.getType());
		assertEquals(Character.toUpperCase(representation),
				blackPiece.getShow());
	}
}

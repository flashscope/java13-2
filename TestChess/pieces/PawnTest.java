package pieces;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		verifyCreation(
				Piece.createWhitePawn(),Piece.createBlackPawn(),
				Piece.pieceType.PAWN, Piece.PAWN_REPRESENTATION);
	}
	
	private void verifyCreation(Piece whitePiece, Piece blackPiece,
			Piece.pieceType type, char representation){
		
	}
}

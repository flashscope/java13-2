package pieces;

public class Piece {
	public static enum pieceColor {PIECE_NONE,PIECE_WHITE,PIECE_BLACK}
	public static enum pieceType {PAWN,KNIGHT,ROOK,BISHOP,QUEEN,KING,NONE}
	private static char[] pieceShow =  {'p','n','r','b','q','k','.'};
	
	pieceColor myColor;
	pieceType myType;
	
	
	public Piece(pieceColor color, pieceType type) {
		this.myColor = color;
		this.myType = type;
	}
	
	
	public pieceColor getColor() {
		return this.myColor;
	}
	
	public pieceType getType() {
		return this.myType;
	}
	
	public char getShow() {
		switch(myColor){
		case PIECE_WHITE:
			return pieceShow[myType.ordinal()];
		case PIECE_BLACK:
			return Character.toUpperCase(pieceShow[myType.ordinal()]);
		default:
			return '.';
		}
	}
	
}

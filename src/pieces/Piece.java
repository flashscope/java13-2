package pieces;
/**
 *	체스말을 표현하는 객체
 */
public class Piece {
	
	/**
	 *	말의 색상을 정해준다.
	 */
	public static enum pieceColor {
		PIECE_WHITE, PIECE_BLACK , PIECE_NONE
	}
	
	/**
	 *	말의 종류를 정한다.
	 */
	public static enum pieceType {
		PAWN, KNIGHT, ROOK, BISHOP, QUEEN, KING, NONE
	}
	
	/**
	 *	말을 체스판으로 보여줄때의 약자를 배열로 정리를 한다.
	 *	enum pieceType과 순서가 동일하다.
	 */
	private static char[] pieceShow = { 'p', 'n', 'r', 'b', 'q', 'k', '.' };

	
	pieceColor myColor;
	pieceType myType;

	/**
	 * Piece를 생성한다. 생성할 때에는 색상과 말의 종류가 필요하다.
	 * @param color	말의 색
	 * @param type	말의 종류
	 */
	public Piece(pieceColor color, pieceType type) {
		this.myColor = color;
		this.myType = type;
	}
	
	/**
	 * 말의 색상값을 pieceColor로 반환한다.
	 */
	public pieceColor getColor() {
		return this.myColor;
	}
	
	/**
	 * 말의 종류를 pieceType로 반환한다.
	 */
	public pieceType getType() {
		return this.myType;
	}
	
	/**
	 * 말의 종류를 약자로 반환한다. 이때 검정색 말은 대문자로 반환한다.
	 */
	public char getShow() {
		switch (myColor) {
		case PIECE_WHITE:
			return pieceShow[myType.ordinal()];
		case PIECE_BLACK:
			return Character.toUpperCase(pieceShow[myType.ordinal()]);
		default:
			return '.';
		}
	}

}

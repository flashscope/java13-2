package pieces;


public class Piece {
	public enum Color {
		WHITE,
		BLACK,
		NOCOLOR;
	}
	
	public enum Type {
		PAWN('p',1),
		ROOK('r',5),
		KNIGHT('n',2.5),
		BISHOP('b',3),
		QUEEN('q',9),
		KING('k',0),
		EMPTY('.',0);
		
		private char symbol;
		private double score;
		
		private Type(char symbol, double score) {
			this.symbol = symbol;
			this.score = score;
		}
		
		public char getSymbol() {
			return symbol;
		}
		
		public double getScore() {
			return score;
		}
	}
	
	private static int countWhitePieces;
	private static int countBlackPieces;
	
	private Color color;
	private Type type;
	
	private Piece(Color color, Type type) {
		this.color = color;
		this.type = type;
	}

	public Color getColor() {
		return this.color;
	}
	
	public char getSymbol() {
		if (isBlack()) {
			return Character.toUpperCase(type.getSymbol());
		}
		return type.getSymbol();
	}
	
	public static int countWhitePieces() {
		return countWhitePieces;
	}

	public static int countBlackPieces() {
		return countBlackPieces;
	}

	public static void resetCountPieces() {
		countWhitePieces = 0;
		countBlackPieces = 0;
	}
	
    boolean isWhite() {
        if (Color.WHITE == color) {
            return true;
        }
        
        return false;
    }

    boolean isBlack() {
        if (Color.BLACK == color) {
            return true;
        }
        
        return false;
    }
    
	public static Piece create(Color color, Type symbol) {
		Piece piece = new Piece(color, symbol);
		if (piece.isWhite()) {
			countWhitePieces++;
		} else if (piece.isBlack()) {
			countBlackPieces++;
		}
		return piece;
	}

	public static Piece noPiece() {
		return new Piece(Color.NOCOLOR, Type.EMPTY);
	}
	
	private static Piece createWhite(Type type) {
		countWhitePieces++;
		return new Piece(Color.WHITE, type);
	}

	private static Piece createBlack(Type type) {
		countBlackPieces++;
		return new Piece(Color.BLACK, type);
	}
	
	public static Piece createWhitePawn() {
		return createWhite(Type.PAWN);
	}

	public static Piece createBlackPawn() {
		return createBlack(Type.PAWN);
	}

	public static Piece createWhiteRook() {
		return createWhite(Type.ROOK);
	}

	public static Piece createBlackRook() {
		return createBlack(Type.ROOK);
	}

	public static Piece createWhiteKnight() {
		return createWhite(Type.KNIGHT);
	}

	public static Piece createBlackKnight() {
		return createBlack(Type.KNIGHT);
	}

	public static Piece createWhiteBishop() {
		return createWhite(Type.BISHOP);
	}

	public static Piece createBlackBishop() {
		return createBlack(Type.BISHOP);
	}

	public static Piece createWhiteQueen() {
		return createWhite(Type.QUEEN);
	}

	public static Piece createBlackQueen() {
		return createBlack(Type.QUEEN);
	}

	public static Piece createWhiteKing() {
		return createWhite(Type.KING);
	}
	
	public static Piece createBlackKing() {
		return createBlack(Type.KING);
	}
	
	public Type getType() {
		return this.type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color != other.color)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}

package pieces;

public class Pawn {
	public static enum pawnColor {PAWN_NONE,PAWN_WHITE,PAWN_BLACK}
	
	pawnColor myColor;
	
	
	
	public Pawn(pawnColor color) {
		this.myColor = color;
	}
	
	
	public pawnColor getColor() {
		return this.myColor;
	}
	
	public char getShow() {
		switch(myColor){
		case PAWN_WHITE:
			return 'p';
		case PAWN_BLACK:
			return 'P';
		default:
			return '.';
		}
	}
	
}

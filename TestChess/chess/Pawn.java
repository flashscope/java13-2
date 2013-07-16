package chess;

class Pawn {
	String myColor;
	public static final String PAWN_WHITE = "white";
	public static final String PAWN_BLACK = "black";
	
	/**
	 * 폰을 생성합니다. 이때 폰의 색상을 같이 정해줍니다.
	 * @param color
	 */
	Pawn(String color) {
		this.myColor = color;
	}
	
	/**
	 * 생성된 폰의 색상을 반환합니다.
	 * @return
	 */
	public String getColor() {
		// TODO Auto-generated method stub
		return this.myColor;
	}
	
}

package chess;

import java.util.ArrayList;

import pieces.Piece;

class Row {
	ArrayList<Piece> rowList = new ArrayList<Piece>();
	
	/**
	 * 주어진 색에 맞는 폰을 가로열에 채워 넣습니다.
	 * @param color	생성하고 싶은 폰의 색상
	 */
	public void setPawnLine(Piece.pieceColor color) {
		rowList.clear();
		for (int i = 0; i < 8; ++i) {
			rowList.add(new Piece(color, Piece.pieceType.PAWN));
		}
	}
	
	/**
	 * 아무것도 없는 가로열을 만듭니다.
	 */
	public void setBlankLine() {
		rowList.clear();
		for (int i = 0; i < 8; ++i) {
			rowList.add(new Piece(Piece.pieceColor.PIECE_NONE, Piece.pieceType.NONE));
		}
	}
	
	/**
	 * 주어진 색에 맞는 룩,나이트,비숍,퀸,킹등 순서에 맞게 가로열에 채워 넣습니다.
	 * @param color	생성하고 싶은 말의 색상
	 */
	public void setOtherLine(Piece.pieceColor color) {
		rowList.clear();
		rowList.add(new Piece(color, Piece.pieceType.ROOK));
		rowList.add(new Piece(color, Piece.pieceType.KNIGHT));
		rowList.add(new Piece(color, Piece.pieceType.BISHOP));
		rowList.add(new Piece(color, Piece.pieceType.QUEEN));
		rowList.add(new Piece(color, Piece.pieceType.KING));
		rowList.add(new Piece(color, Piece.pieceType.BISHOP));
		rowList.add(new Piece(color, Piece.pieceType.KNIGHT));
		rowList.add(new Piece(color, Piece.pieceType.ROOK));
	}
	
	/**
	 * 해당 가로열에 있는 말의 종류를 약자로 문자열에 표시해 반환합니다.
	 * @return	가로열에 있는 말의 종류 문자열
	 */
	public String getRowString() {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 8; ++j) {
			sb.append(rowList.get(j).getShow());
		}

		return sb.toString();
	}
	
	/**
	 * 해당 가로열에 있는 말의 갯수를 반환합니다.
	 * @return	가로열에 있는 말의 갯수
	 */
	public int getRowPieceSize() {
		int pieceSize = 0;
		for (int i = 0; i < 8; ++i) {
			if (rowList.get(i).getColor() != Piece.pieceColor.PIECE_NONE) {
				++pieceSize;
			}
		}
		return pieceSize;
	}

}

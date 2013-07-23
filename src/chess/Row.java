package chess;

import java.util.ArrayList;

import pieces.Piece;

class Row {
	ArrayList<Piece> rowList = new ArrayList<Piece>();

	Row(Piece.pieceColor color, Piece.pieceType type) {
		rowList.clear();
		
		for (int i = 0; i < 8; ++i) {
			rowList.add(new Piece(color,type));
		}
		
	}


	public String getRowString() {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 8; ++j) {
			sb.append(rowList.get(j).getShow());
		}

		return sb.toString();
	}
	
	
	public int getRowPieceSize(){
		int pieceSize = 0;
		for(int i=0; i<8; ++i){
			if(rowList.get(i).getColor()!=Piece.pieceColor.PIECE_NONE){
				++pieceSize;
			}
		}
		return pieceSize;
	}
	

}

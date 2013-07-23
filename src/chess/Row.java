package chess;

import java.util.ArrayList;

import pieces.Pawn;

class Row {
	ArrayList<Pawn> rowList = new ArrayList<Pawn>();

	Row(Pawn.pawnColor color) {
		rowList.clear();

		for (int i = 0; i < 8; ++i) {
			rowList.add(new Pawn(color));
		}
		
	}


	public String getRowString() {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 8; ++j) {
			sb.append(rowList.get(j).getShow());
		}

		return sb.toString();
	}
	
	
	public int getRowPawnSize(){
		int pawnSize = 0;
		for(int i=0; i<8; ++i){
			if(rowList.get(i).getColor()!=Pawn.pawnColor.PAWN_NONE){
				++pawnSize;
			}
		}
		return pawnSize;
	}
	

}

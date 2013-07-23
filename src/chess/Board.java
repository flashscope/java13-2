package chess;
import java.util.ArrayList;

import pieces.Pawn;

/**
 * 체스판으로 체스말을 올려놓는 용도입니다.
 * @author flashscope
 *
 */
class Board {
	private static ArrayList<Row> boardList = new ArrayList<Row>();
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	Board(){
		initialize();
	}
	
	private void initialize(){
		boardList.clear();
		for(int i=0; i<8; ++i){
			if(i==1){
				boardList.add(new Row(Pawn.pawnColor.PAWN_WHITE));
			}else if(i==6){
				boardList.add(new Row(Pawn.pawnColor.PAWN_BLACK));
			}else{
				boardList.add(new Row(Pawn.pawnColor.PAWN_NONE));
			}
		}
	}
	

	
	public String getRowStringById(int index){
		return boardList.get(index).getRowString();
	}
	
	
	public int getPawnSize(){
		int pawnSize = 0;
		for(int i=0; i<8; ++i){
			pawnSize += boardList.get(i).getRowPawnSize();
		}
		return pawnSize;
	}
	
	
	public void printBoard(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<8; ++i){
			sb.append(boardList.get(i).getRowString());
			sb.append(NEW_LINE);
		}
		System.out.println("-------------------");
		System.out.println(sb);
		System.out.println("-------------------");
	}
	

	

}

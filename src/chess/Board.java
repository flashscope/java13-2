package chess;
import java.util.ArrayList;

import pieces.Pawn;

/**
 * 체스판으로 체스말을 올려놓는 용도입니다.
 * @author flashscope
 *
 */
class Board {
	
	private static ArrayList<ArrayList<Pawn>> boardList = new ArrayList<ArrayList<Pawn>>();
	
	Board(){
		initialize();
	}
	
	private void initialize(){
		boardList.clear();
		for(int i=0; i<8; ++i){
			if(i==1){
				boardList.add(makePawnList(Pawn.PAWN_WHITE,'p'));
			}else if(i==6){
				boardList.add(makePawnList(Pawn.PAWN_BLACK,'P'));
			}else{
				boardList.add(makePawnList("none",'.'));
			}
		}
	}
	
	private ArrayList<Pawn> makePawnList(String color,char show){
		ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
		pawnList.clear();
		
		for(int i=0; i<8; ++i){
			pawnList.add(new Pawn(color,show));
		}
		
		return pawnList;
	}
	
	
	public int getPawnSize(){
		int pawnSize = 0;
		for(int i=0; i<8; ++i){
			for(int j=0; j<8; ++j){
				if(boardList.get(i).get(j).getColor()!="none"){
					++pawnSize;
				}
			}
		}
		return pawnSize;
	}
	
	public void printBoard(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<8; ++i){
			for(int j=0; j<8; ++j){
				sb.append(boardList.get(i).get(j).getShow());
			}
			sb.append("\n");
		}
		System.out.println("-------------------");
		System.out.println(sb);
		System.out.println("-------------------");
	}
	

}

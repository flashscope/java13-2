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
		//addPawn(new Pawn(Pawn.PAWN_WHITE,'p'));
		//addPawn(new Pawn(Pawn.PAWN_BLACK,'P'));
		initialize();
	}
	
	private void initialize(){
		boardList.clear();
		for(int i=0; i<8; ++i){
			if(i==1){
				System.out.println("add p-"+i+"-"+makePawnList(Pawn.PAWN_WHITE,'p').size());
				boardList.add(makePawnList(Pawn.PAWN_WHITE,'p'));
			}else if(i==6){
				System.out.println("add P-"+i);
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
				boardList.get(i).size();
				System.out.println(boardList.get(i).get(j).getColor());

				if(boardList.get(i).get(j).getColor()!="none"){
					++pawnSize;
				}
				
			}
		}
		return pawnSize;
	}
	
	

}

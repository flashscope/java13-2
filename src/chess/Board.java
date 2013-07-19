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
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	Board(){
		initialize();
	}
	
	private void initialize(){
		boardList.clear();
		for(int i=0; i<8; ++i){
			if(i==1){
				boardList.add(makePawnList(Pawn.pawnColor.PAWN_WHITE));
			}else if(i==6){
				boardList.add(makePawnList(Pawn.pawnColor.PAWN_BLACK));
			}else{
				boardList.add(makePawnList(Pawn.pawnColor.PAWN_NONE));
			}
		}
	}
	
	private ArrayList<Pawn> makePawnList(Pawn.pawnColor color){
		ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
		pawnList.clear();
		
		for(int i=0; i<8; ++i){
			pawnList.add(new Pawn(color));
		}
		
		return pawnList;
	}
	
	
	public int getPawnSize(){
		int pawnSize = 0;
		for(int i=0; i<8; ++i){
			for(int j=0; j<8; ++j){
				if(boardList.get(i).get(j).getColor()!=Pawn.pawnColor.PAWN_NONE){
					++pawnSize;
				}
			}
		}
		return pawnSize;
	}
	
	public void printBoard(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<boardList.size(); ++i){
			for(int j=0; j<boardList.get(i).size(); ++j){
				sb.append(" "+boardList.get(i).get(j).getShow());
			}
			sb.append(NEW_LINE);
		}
		System.out.println("-------------------");
		System.out.println(sb);
		System.out.println("-------------------");
	}
	
	public String getRowString(int index){
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<boardList.get(index).size(); ++j){
			sb.append(boardList.get(index).get(j).getShow());
		}
		
		return sb.toString();
	}
	

}

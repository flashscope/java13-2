package chess;
import java.util.ArrayList;

import pieces.Pawn;

/**
 * 체스판으로 체스말을 올려놓는 용도입니다.
 * @author flashscope
 *
 */
class Board {
	
	private static ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
	
	Board(){
		//nothing now
	}
	
	/**
	 * Pawn을 인자로 넣어 보드에 폰을 추가합니다.
	 * @param pawn
	 */
	public void addPawn(Pawn pawn){
		pawnList.add(pawn);
	}
	
	/**
	 * 보드에 올라와 있는 폰의 갯수를 반환합니다.
	 * @return
	 */
	public int getPawnSize(){
		return pawnList.size();
	}
	
	/**
	 * 폰이 저장되어있는 리스트를 반환합니다.
	 * @return
	 */
	public ArrayList<Pawn> getPawnList(){
		return pawnList;
	}
	
}

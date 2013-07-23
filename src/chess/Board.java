package chess;
import java.util.ArrayList;

import pieces.Piece;

/**
 * 체스판으로 체스말을 올려놓는 용도입니다.
 * @author flashscope
 *
 */
class Board {
	private static ArrayList<Row> boardList = new ArrayList<Row>();
	private static util.StringUtill strUtil = new util.StringUtill();
	
	Board(){
		initialize();
	}
	
	private void initialize(){
		boardList.clear();
		for(int i=0; i<8; ++i){
			if(i==1){
				boardList.add(new Row(Piece.pieceColor.PIECE_WHITE,Piece.pieceType.PAWN));
			}else if(i==6){
				boardList.add(new Row(Piece.pieceColor.PIECE_BLACK,Piece.pieceType.PAWN));
			}else{
				boardList.add(new Row(Piece.pieceColor.PIECE_NONE,Piece.pieceType.NONE));
			}
		}
	}
	

	
	public String getRowStringById(int index){
		return boardList.get(index).getRowString();
	}
	
	
	public int getPieceSize(){
		int pieceSize = 0;
		for(int i=0; i<8; ++i){
			pieceSize += boardList.get(i).getRowPieceSize();
		}
		return pieceSize;
	}
	
	
	public void printBoard(){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<8; ++i){
			sb.append(strUtil.appendNewLine(boardList.get(i).getRowString()));
		}
		System.out.println(sb);
	}
	

	

}

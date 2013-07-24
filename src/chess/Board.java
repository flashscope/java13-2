package chess;

import java.util.ArrayList;

import pieces.Piece;
import util.StringUtil;

/**
 * 체스판으로 체스말을 올려놓는 용도입니다.
 * 
 * @author flashscope
 * 
 */
class Board {
	private static ArrayList<Row> boardList = new ArrayList<Row>();

	/**
	 * 체스판을 초기화 합니다.
	 * 이때 기본적인 말도 같이 배치합니다.
	 */
	public void initialize() {
		boardList.clear();
		for (int i = 0; i < 8; ++i) {
			Row row = new Row();
			switch (i) {
			case 0:
				row.setOtherLine(Piece.pieceColor.PIECE_BLACK);
				break;
			case 1:
				row.setPawnLine(Piece.pieceColor.PIECE_BLACK);
				break;
			case 6:
				row.setPawnLine(Piece.pieceColor.PIECE_WHITE);
				break;
			case 7:
				row.setOtherLine(Piece.pieceColor.PIECE_WHITE);
				break;
			default:
				row.setBlankLine();
				break;
			}

			boardList.add(row);
		}
	}
	
	/**
	 * 원하는 가로줄에 배치된 말의 종류를 문자열로 반환합니다.
	 * @param index	보고 싶은 줄의 인덱스
	 * @return	나열된 말의 종류를 문자열로 반환
	 */
	public String getRowStringById(int index) {
		return boardList.get(index).getRowString();
	}

	/**
	 * 체스판 전체에 있는 말의 갯수를 반환합니다.
	 * @return	현재 체스판 위에 있는 말의 갯수
	 */
	public int getPieceSize() {
		int pieceSize = 0;
		for (int i = 0; i < 8; ++i) {
			pieceSize += boardList.get(i).getRowPieceSize();
		}
		return pieceSize;
	}
	
	
	/**
	 * 특정 색과 종류의 말의 갯수를 구합니다.
	 * @return	현재 체스판 위에 있는 특정한 말의 갯수
	 */
	public int getSpecialPieceSize(Piece.pieceColor color, Piece.pieceType type) {
		int pieceSize = 0;
		for (int i = 0; i < 8; ++i) {
			pieceSize += boardList.get(i).getRowSpecialPieceSize(color,type);
		}
		return pieceSize;
	}
	
	/**
	 * 체스판의 현재 모습을 약자로 표시를 해줍니다.
	 * println으로 출력도 하지만 문자열로 반환도 합니다.
	 * @return	체스판의 현재 모습을 담은 문자열
	 */
	public String printBoard() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; ++i) {
			sb.append(StringUtil.appendNewLine(boardList.get(i).getRowString()));
		}
		System.out.println(sb);

		return sb.toString();
	}

}

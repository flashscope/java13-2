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

	public String getRowStringById(int index) {
		return boardList.get(index).getRowString();
	}

	public int getPieceSize() {
		int pieceSize = 0;
		for (int i = 0; i < 8; ++i) {
			pieceSize += boardList.get(i).getRowPieceSize();
		}
		return pieceSize;
	}

	public String printBoard() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; ++i) {
			sb.append(StringUtil.appendNewLine(boardList.get(i).getRowString()));
		}
		System.out.println(sb);

		return sb.toString();
	}

}

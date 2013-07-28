package chess;

import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class Row {
	private ArrayList<Piece> row = new ArrayList<Piece>();

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.noPiece());
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.createWhitePawn());
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.createBlackPawn());
		}
	}
	
	void initializeWhiteExceptPawn() {
		row.add(Piece.create(WHITE, ROOK));
		row.add(Piece.create(WHITE, KNIGHT));
		row.add(Piece.create(WHITE, BISHOP));
		row.add(Piece.create(WHITE, QUEEN));
		row.add(Piece.create(WHITE, KING));
		row.add(Piece.create(WHITE, BISHOP));
		row.add(Piece.create(WHITE, KNIGHT));
		row.add(Piece.create(WHITE, ROOK));
	}
	

	void initializeBlackExceptPawn() {
		row.add(Piece.create(BLACK, ROOK));
		row.add(Piece.create(BLACK, KNIGHT));
		row.add(Piece.create(BLACK, BISHOP));
		row.add(Piece.create(BLACK, QUEEN));
		row.add(Piece.create(BLACK, KING));
		row.add(Piece.create(BLACK, BISHOP));
		row.add(Piece.create(BLACK, KNIGHT));
		row.add(Piece.create(BLACK, ROOK));		
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}

	public int getCount(Color color, Type type) {
		int pieceCount = 0;
		
		for (Piece piece : row) {
			if (piece.equals(Piece.create(color, type))) {
				pieceCount++;
			}
		}
		return pieceCount;
	}

	public Piece getPieceByIndex(int index) {
		return row.get(index);
	}
	
	public void setPieceByIndex(int index, Piece piece) {
		row.set(index, piece);
	}
	
	public double getScoreWhite() {
		double pieceScore = 0;
		for (Piece piece : row) {
			if(piece.getColor()==WHITE){
				pieceScore += piece.getType().getScore();
			}
		}
		return pieceScore;
	}
	
	public double getScoreBlack() {
		double pieceScore = 0;
		for (Piece piece : row) {
			if(piece.getColor()==BLACK){
				pieceScore += piece.getType().getScore();
			}
		}
		return pieceScore;
	}
	
	public boolean isBlackPawn(int index){
		if(row.get(index).getColor()==BLACK && row.get(index).getType()==PAWN){
			return true;
		}
		return false;
	}
	
	public boolean isWhitePawn(int index){
		if(row.get(index).getColor()==WHITE && row.get(index).getType()==PAWN){
			return true;
		}
		return false;
	}
}

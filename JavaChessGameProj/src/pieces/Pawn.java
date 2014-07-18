package pieces;

import chess.Board;

public class Pawn extends Piece{

	public Pawn(String colorIn) {
		super(colorIn);
		
		if(color == "white"){
			symbol = "wPa";
		}
		else{
			symbol = "bPa";
		}
	}

	public String checkMove(int[] moveFromReq, int[] moveToReq) {
		
		int moveFromX = moveFromReq[0];
		int moveFromY = moveFromReq[1];
		int moveToX = moveFromReq[0];
		int moveToY = moveFromReq[1];
		
		if(Board.board[moveToY][moveToX]moveFromReq.getColor())
		if(Board.board[moveToY][moveToX] == (new Pawn("white"))
		
		
	}
	
	
}

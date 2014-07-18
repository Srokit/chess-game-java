package pieces;

import chess.Board;

public class Bishop extends Piece{

	public Bishop(String colorIn) {
		super(colorIn);
		
		if(color == "white"){
			symbol = "wBi";
		}
		else{
			symbol = "bBi";
		}
	}

	@Override
	public String checkMove(int[] moveFromReq, int[] moveToReq) {
		// TODO Auto-generated method stub
		return null;
	}
}

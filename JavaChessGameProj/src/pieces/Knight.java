package pieces;

import chess.Board;

public class Knight extends Piece{

	public Knight(String colorIn) {
		super(colorIn);
		
		if(color == "white"){
			symbol = "wKn";
		}
		else{
			symbol = "bKn";
		}
	}

	@Override
	public String checkMove(int[] moveFromReq, int[] moveToReq) {
		// TODO Auto-generated method stub
		return null;
	}
}

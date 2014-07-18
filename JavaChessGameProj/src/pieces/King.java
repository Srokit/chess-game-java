package pieces;

import chess.Board;

public class King extends Piece{

	public King(String colorIn) {
		super(colorIn);
		
		if(this.color == "white"){
			symbol = "wKi";
		}
		else{
			symbol = "bKi";
		}
	}

	@Override
	public String checkMove(int[] moveFromReq, int[] moveToReq) {
		// TODO Auto-generated method stub
		return null;
	}
}

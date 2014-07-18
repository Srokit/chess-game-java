package pieces;

import chess.Board;

public class Rook extends Piece{

	public Rook(String colorIn) {
		super(colorIn);
		color = colorIn;
		
		if(color == "white"){
			symbol = "wRo";
		}
		else{
			symbol = "bRo";
		}
	}

	@Override
	public String checkMove(int[] moveFromReq, int[] moveToReq) {
		return null;
	}
}

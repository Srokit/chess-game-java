package pieces;

import chess.Board;

public class Queen extends Piece{

	public Queen(String colorIn) {
		super(colorIn);
		color = colorIn;
		
		if(color == "white"){
			symbol = "wQu";
		}
		else{
			symbol = "bQu";
		}
	}

	@Override
	public String checkMove(int[] moveFromReq, int[] moveToReq) {
		// TODO Auto-generated method stub
		return null;
	}

}

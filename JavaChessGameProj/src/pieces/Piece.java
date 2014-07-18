package pieces;

import chess.Square;

public abstract class Piece extends Square{ 
	
	protected String color; //black or white
	
	public Piece(String colorIn) {
		color = colorIn;
	}
	
	public abstract String checkMove(int[] moveFromReq, int[] moveToReq); //check if the move is valid for the type of piece
	
	public String getColor(){
		return color;
	}
}

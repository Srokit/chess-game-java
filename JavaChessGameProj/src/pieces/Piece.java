package pieces;

import chess.Square;

public abstract class Piece extends Square{ 
	
	String color; //black or white
	
	public Piece(int[] location, String color) {
		super(location);
	}

	public abstract void move(); //should be declared differently for each piece
	
	public void takeOffBoard(){
		location[0] = -1; //-1 indicates that the piece is not on the board
		location[1] = -1;
	}

}

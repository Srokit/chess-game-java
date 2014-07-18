package pieces;

public class Pawn extends Piece{

	public Pawn(int[] location, String color) {
		super(location, color);
		this.color = color;
		
		if(color == "white"){
			symbol = "wPa";
		}
		else{
			symbol = "bPa";
		}
		
	}

	public void move() {
		
	}

}

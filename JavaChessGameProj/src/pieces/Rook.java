package pieces;

public class Rook extends Piece{

	public Rook(int[] location, String color) {
		super(location, color);
		this.color = color;
		
		if(color == "white"){
			symbol = "wRo";
		}
		else{
			symbol = "bRo";
		}
	}

	public void move() {
		
	}

}

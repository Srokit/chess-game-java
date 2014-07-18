package pieces;

public class Knight extends Piece{

	
	public Knight(int[] location, String color) {
		super(location, color);
		this.color = color;
		
		if(color == "white"){
			symbol = "wKn";
		}
		else{
			symbol = "bKn";
		}
	}

	public void move() {
		
	}

}

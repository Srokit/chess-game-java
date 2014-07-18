package pieces;

public class Queen extends Piece{

	
	public Queen(int[] location, String color) {
		super(location, color);
		this.color = color;
		
		if(color == "white"){
			symbol = "wQu";
		}
		else{
			symbol = "bQu";
		}
	}

	public void move() {
		
	}

}

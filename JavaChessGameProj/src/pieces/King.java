package pieces;

public class King extends Piece{

	public King(int[] location, String color) {
		super(location, color);
		this.color = color;
		
		if(color == "white"){
			symbol = "wKi";
		}
		else{
			symbol = "bKi";
		}
	}

	public void move() {
	
		
	}

}

package pieces;

public class Bishop extends Piece{

	
	public Bishop(int[] location, String color) {
		super(location, color);
		this.color = color;
		
		if(color == "white"){
			symbol = "wBi";
		}
		else{
			symbol = "bBi";
		}
	}

	public void move() {
		
	}
	

}

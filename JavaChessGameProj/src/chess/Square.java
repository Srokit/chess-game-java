package chess;

public abstract class Square {
	
	protected int location[] = new int[2]; //x is 0 index, y is 1 index :coordinates
	//-1 indicates that piece is off the board
	protected String symbol;
	
	String getSymbol(){
		return symbol;
	}
	
	public abstract void move(); //universal move function
	
	protected Square(int[] location) {
		this.location = location;
	}
	
}

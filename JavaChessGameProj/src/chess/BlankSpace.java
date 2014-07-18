package chess;

class BlankSpace extends Square{
	
	BlankSpace(int[] location) {
		super(location);
		symbol = "-*-";
	}

	public void move() {
		
	}

}

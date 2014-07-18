package chess;

import java.util.Scanner;
import pieces.*; //get piece classes

//board is the main class for the game
public abstract class Board {
	
	static final char SIDE_LETTERS[] = {'A','B','C','D','E','F','G','H'};
	static final int SIDE_NUMS[] = {1,2,3,4,5,6,7,8};//symbols on the side of board
	private static Square board[][] = new Square[8][8];
	
	private static final Scanner scanner = new Scanner(System.in);
	
	private static void setup(){
		int[] location = {0,0}; //board array and location x,y are inverted | using location variable for each location input
		board[0][0] = new Rook(location, "black");
		location[0] = 1;
		board[0][1] = new Knight(location, "black");
		location[0] = 2;
		board[0][2] = new Bishop(location, "black");
		location[0] = 3;
		board[0][3] = new Queen(location, "black");
		location[0] = 4;
		board[0][4] = new King(location, "black");
		location[0] = 5;
		board[0][5] = new Bishop(location, "black");
		location[0] = 6;
		board[0][6] = new Knight(location, "black");
		location[0] = 7;
		board[0][7] = new Knight(location, "black");
		
		location[1] = 1; //pawns
		for(int i = 0; i < 8; i++){
			location[0] = i;
			board[1][i] = new Pawn(location, "black");
		}
		
		for(int i = 2; i < 6; i++){ //creating blank spaces in middle
			for(int j = 0; j < 8; j++){
				location[0] = j;
				location[1] = i;
				board[i][j] = new BlankSpace(location);
			}
		}
		
		location[1] = 6; //pawns
		for(int i = 0; i < 8; i++){
			location[0] = i;
			board[1][i] = new Pawn(location, "white");
		}
		
		location[1] = 7; 
		location[0] = 0;
		board[7][0] = new Rook(location, "white");
		location[0] = 1;
		board[7][1] = new Knight(location, "white");
		location[0] = 2;
		board[7][2] = new Bishop(location, "white");
		location[0] = 3;
		board[7][3] = new Queen(location, "white");
		location[0] = 4;
		board[7][4] = new King(location, "white");
		location[0] = 5;
		board[7][5] = new Bishop(location, "white");
		location[0] = 6;
		board[7][6] = new Knight(location, "white");
		location[0] = 7;
		board[7][7] = new Knight(location, "white");
		
	}
	
	private static void draw(){
		System.out.print("\n");
		
		for(char i: SIDE_LETTERS){ //printing letters across the top
			System.out.print(" " + i + " ");
		}
		
		System.out.print("\n");
		for(int i = 0; i < 8; i++){ //looping through the board and printing symbols
			System.out.print(" " + (8 - i) + " "); //print number on left side
			
			for(Square j: board[i]){
				System.out.print(j.getSymbol()); //tab for format
			}
			System.out.print(" " + (8 - i) + " "); //number on right side
			
			System.out.print("\n\n");//to get next line
		}
		
		for(char i: SIDE_LETTERS){ //printing letters across the bottom
			System.out.print(" " + i + " ");
		}
	}
	
	private static String getName(int playerNum){
		String name;
		
		while(true){
			System.out.print("Player " + playerNum + " please enter your name.\n>> ");
			name = scanner.nextLine().trim();
			if(!name.isEmpty() && !(name.contains(" ") || name.contains("\t"))) //if there is no spaces and it is not empty
				break; //otherwise the user will be asked to enter again
			else
				System.out.println("Invalid name. Try again.");
		}
		return name;
	}
	public static void main(String[] args) {
		System.out.println("=====> CHESS <====="); //title
		
		String ply1Name = getName(1);
		String ply2Name = getName(2);
		
		Player whitePly = new Player(ply1Name, "white");
		Player blackPly = new Player(ply2Name, "black");
		
		setup(); //get board set
		
		//start main loop
		while(true){
			draw(); //show board
			whitePly.getMove();
			blackPly.getMove();
			break;
		}
		
		scanner.close();
	}
	
	
}

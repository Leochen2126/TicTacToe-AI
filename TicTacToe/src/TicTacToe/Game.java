package TicTacToe;
import java.util.*; 
//@author Leo Chen

public class Game {
	private int moveNumber;
	String[][] gameBoard = {{"0","1","2"},{"3","4","5"},{"6","7","8"}};
	private final Player Player1;
	private final Player Player2;
	private Player currentPlayer;
	private List<Integer> movesMade =  new ArrayList<>();
	
	public Game(Player aPlayer1, Player aPlayer2) {
		Player1=aPlayer1;
		Player2=aPlayer2;
		currentPlayer = Player1;
		moveNumber = 0;		
	}
	
	//gets the move from the current player
	public void getMove() {
		
		if (moveNumber!=9) {
			if (currentPlayer == Player1) {
				int moved = Player1.move(gameBoard, this.getMoves(), "X");
				movesMade.add(moved);
				currentPlayer = Player2;
			}
			else {
				int moved = Player2.move(gameBoard, this.getMoves(), "O");
				movesMade.add(moved);
				currentPlayer = Player1;
			}
			moveNumber++;
		
		}
		
	}
	@Override
	public String toString() {
		String output="Tic-Tac-Toe";
		for (int i=0; i<3; i++) {
			output+="\n\n";
			for (int j=0;j<3;j++) {
				output += gameBoard[i][j];
				output += "   ";
			}
		}
		return output;
	}
	public int getRound() {
		return moveNumber;
	}
	
	public Player checkWin() {
		boolean result = false;
		String winSymbol = "";
		if(gameBoard[0][0].equals(gameBoard[0][1])&&gameBoard[0][0].equals(gameBoard[0][2])) {
			result=true;
			winSymbol=gameBoard[0][0];
		}
		else if(gameBoard[1][0].equals(gameBoard[1][1])&&gameBoard[1][0].equals(gameBoard[1][2])) {
			result=true;
			winSymbol=gameBoard[1][0];
		}
		else if(gameBoard[2][0].equals(gameBoard[2][1])&&gameBoard[2][0].equals(gameBoard[2][2])) {
			result=true;
			winSymbol=gameBoard[2][0];
		}
		
		else if(gameBoard[0][0].equals(gameBoard[1][0])&&gameBoard[0][0].equals(gameBoard[2][0])) {
			result=true;
			winSymbol=gameBoard[0][0];
		}
		else if(gameBoard[0][1].equals(gameBoard[1][1])&&gameBoard[0][1].equals(gameBoard[2][1])) {
			result=true;
			winSymbol=gameBoard[0][1];
		}
		else if(gameBoard[0][2].equals(gameBoard[1][2])&&gameBoard[0][2].equals(gameBoard[2][2])) {
			result=true;
			winSymbol=gameBoard[0][2];
		}
		else if(gameBoard[0][0].equals(gameBoard[1][1])&&gameBoard[0][0].equals(gameBoard[2][2])) {
			result=true;
			winSymbol=gameBoard[0][0];
		}
		else if(gameBoard[0][2].equals(gameBoard[1][1])&&gameBoard[0][2].equals(gameBoard[2][0])) {
			result=true;
			winSymbol=gameBoard[0][2];
		}
		
		if(result) {
			if (winSymbol.equals("X")) {
				return Player1;
			}
			else {
				return Player2;
			}
		}
		return null;
	}
	
	public List<Integer> getMoves(){
		return new ArrayList<>(movesMade);
	}
	
	
}



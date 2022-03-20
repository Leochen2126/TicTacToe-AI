package TicTacToe;

//@author Leo Chen

public class Game {
	private int moveNumber;
	String[][] gameBoard = {{"0","1","2"},{"3","4","5"},{"6","7","8"}};
	private final Player Player1;
	private final Player Player2;
	private Player currentPlayer;
	
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
				Player1.move(gameBoard, "X");
				currentPlayer = Player2;
			}
			else {
				Player2.move(gameBoard, "O");
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
	
	
}



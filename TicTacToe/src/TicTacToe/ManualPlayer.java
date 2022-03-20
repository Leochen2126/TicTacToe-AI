package TicTacToe;
import java.util.*; 

public class ManualPlayer implements Player {

	@Override
	public void move(String[][] gameBoard, String symbol) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose a move");
		String input = sc.nextLine();
		gameBoard[moveParser(input)[0]][moveParser(input)[1]] = symbol;	
		
		sc.close();
	}
	
	/*
	 * parses the chosen move to be the correct indices in the gameBoard
	 * @Before must be a string of a single number from 0-8 e.g. position = "1"
	 */
	public int[] moveParser(String position) {
		int numberPosition = Integer.parseInt(position);
		int row = numberPosition/3;
		int col = numberPosition%3;
		int[] output = {row,col};
		return output;
	}

}

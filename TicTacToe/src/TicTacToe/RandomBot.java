package TicTacToe;

import java.util.List;

public class RandomBot implements Player {

	
	@Override
	public int move(String[][] gameBoard, List<Integer> moves, String symbol) {
		int randomPos = (int) (Math.random() * 9);
		while (moves.contains(randomPos)) {
			randomPos = (int) (Math.random() * 9);
		}
		gameBoard[moveParser(randomPos)[0]][moveParser(randomPos)[1]] = symbol;	
				
		return randomPos;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "RandomBot";
	}
	
	public int[] moveParser(int numberPosition) {
		int row = numberPosition/3;
		int col = numberPosition%3;
		int[] output = {row,col};
		return output;
	}

}

package TicTacToe;

import java.util.List;


public class SimpleBot implements Player {

	
	@Override
	public int move(String[][] gameBoard, List<Integer> moves, String symbol) {
		int i ;
		for(i=0; i<9;i++) {
			
			if (!(moves.contains(i))) {
				gameBoard[moveParser(i)[0]][moveParser(i)[1]] = symbol;
				break;
			}
			
		}
		return i;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SimpleBot";
	}
	
	public int[] moveParser(int numberPosition) {
		int row = numberPosition/3;
		int col = numberPosition%3;
		int[] output = {row,col};
		return output;
	}

}
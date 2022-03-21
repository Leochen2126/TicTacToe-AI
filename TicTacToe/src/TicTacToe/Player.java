package TicTacToe;
import java.util.*; 

public interface Player {
	
	public int move(String[][] gameBoard, List<Integer> moves, String symbol);
	public String getName();
	

}

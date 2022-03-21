package TicTacToe;
import java.util.*; 

/*
 * interface for Player class that determines the move
 * @author Leo
 */

public interface Player {
	
	public int move(String[][] gameBoard, List<Integer> moves, String symbol);
	public String getName();
	

}

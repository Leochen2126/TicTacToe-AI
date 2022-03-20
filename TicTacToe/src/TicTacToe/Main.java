package TicTacToe;

public class Main {
	public static void main(String args[]) {
		Game game =  new Game(new ManualPlayer(), null);
		System.out.println(game.toString());
		game.getMove();
		System.out.println(game.toString());
	}
}

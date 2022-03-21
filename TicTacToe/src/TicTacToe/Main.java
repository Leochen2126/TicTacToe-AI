package TicTacToe;

public class Main {
	
	public static void main(String args[]) {
		 testGame3();
	}
	
	public static void testGame() {
		Player player1 =new ManualPlayer("p1");
		Player player2 =new ManualPlayer("p2");
		Game game =  new Game(player1, player2);
		while(game.getRound()!=9) {
			System.out.println(game.toString());
			game.getMove();
			if (game.checkWin()!=null) {
				System.out.println(game.toString());
				System.out.println(game.checkWin().getName() + " has WON");
				return;
				
			}
		}
		System.out.println(game.toString());
		System.out.println("tie");
	}
	public static void testGame2() {
		Player player1 =new ManualPlayer("p1");
		Game game =  new Game(new SimpleBot(), player1);
		while(game.getRound()!=9) {
			System.out.println(game.toString());
			game.getMove();
			if (game.checkWin()!=null) {
				System.out.println(game.toString());
				System.out.println(game.checkWin().getName() + " has WON");
				return;
				
			}
		}
		System.out.println(game.toString());
		System.out.println("tie");
	}
	public static void testGame3() {
		Game game =  new Game(new SimpleBot(), new RandomBot());
		while(game.getRound()!=9) {
			for (int i = 0; i<game.getMoves().size();i++) {
				System.out.print(game.getMoves().get(i));
			}
			System.out.println(game.toString());
			game.getMove();
			if (game.checkWin()!=null) {
				System.out.println(game.toString());
				System.out.println(game.checkWin().getName() + " has WON");
				return;
				
			}
		}
		System.out.println(game.toString());
		System.out.println("tie");
	}
}

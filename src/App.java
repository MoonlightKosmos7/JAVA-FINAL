
public class App {

		public static void main (String[] args) {
			/*
			 * Start new deck (shuffled) with players
			 */
			Deck deck = new Deck ();
			Player player1 = new Player ("Tae");
			Player player2 = new Player ("Joon");
			deck.shuffle();
		
		/*
		 *  For loop on draw method using 52 cards
		 */
			for (int i= 0; i < 52; i++) {
				if (i%2 == 0) {
				player1.draw(deck);
			} else {
					player2.draw(deck);
			}
				
		}
			/*
			 *  For loop to iterate 26 times & flip method
			 */
		for (int k = 0; k < 26; k++) {
			int Tae = player1.flip().getValue();
			int Joon = player2.flip().getValue();
				if(Tae>Joon) {
					player1.incrementScore();
						System.out.println("Tae wins the flip!");
				} else if (Joon>Tae) {
					player2.incrementScore();
						System.out.println("Joon wins the flip!");
				} else {
						System.out.println("It's a draw!");
					}
				}
		/*
		 *  Winner of the game!
		 */
		System.out.println( "Tae's Score ="+  player1.getScore());
		System.out.println("Joon's Score ="+ player2.getScore());
			if (player1.getScore()> player2.getScore()) {
				System.out.println("Tae is the WINNER!");
			} else if (player1.getScore() < player2.getScore()){
				player2.getScore();
				System.out.println("Joon is the WINNER!");
			} else {
				System.out.println("IT'S DRAW");
			}
		}
			
				
				
}

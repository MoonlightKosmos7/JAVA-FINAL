import java.util.ArrayList;
import java.util.List;

public class Player {
	/*
	 * Card list with constructor & names
	 */
	List <Card> hand = new ArrayList <>();
	int score = 0;
	String name; 
	
	public Player (String name) {
		this.name = name;
	}
	/*
	 * Describe Method 
	 */
	
		public String describe () {
			StringBuilder playerDescribe = new StringBuilder ();
				for (Card card:hand) {
					playerDescribe.append(card.describe());
		}
			return playerDescribe.toString();		
	}
	/*
	 * Flip Method
	 */
		public Card flip () {
			return hand.remove(0);
		}
	/*
	 * Draw Method	
	 */
		public void draw (Deck deck) {
				hand.add((deck.draw()));
				}
		
	/*
	 * Increment Score Method
	 */
		public void incrementScore () {
			score++;
			}
	/*
	 * Score Keeper
	 */

		public int getScore() {
			return score;
		}
	
		
		
		
		
		
}

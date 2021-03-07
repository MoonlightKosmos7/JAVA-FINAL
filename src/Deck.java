import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	/*
	 * List of Cards
	 */
	List <Card> cards= new ArrayList<Card>();
	List <String> names = Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs");
	
	/*
	 * Constructor 
	 */
	public Deck () {
		for (int i=2; i<= 15; i++) {
			for (String name: names) {
				cards.add(new Card(i, name));
			}
		}
	}
	
/*
 * Shuffle Method 
 */
	public void shuffle () {
		Collections.shuffle(cards);
	}
	/*
	 * Draw Method
	 */
		public Card draw () {
			return cards.remove(0);
			
		}
}

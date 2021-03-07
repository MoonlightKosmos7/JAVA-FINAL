
public class Card {
 
	/*
	 * Name and Value fields 
	 */
	private int value;
	private String name;
	
	/*
	 * Constructor 
	 */
	
	public Card (int newValue, String name) {
		value = newValue;
		
		switch (newValue) {
		case 2: 
				name= "Two";
					break;
		case 3: 
				name = "Three";
					break;
		case 4:
				name= "Four";
					break;
		case 5:
				name= "Five";
					break;
		case 6:
				name = "Six";
					break;
		case 7:
				name = "Seven";
					break;
		case 8:
				name= "Eight";
						break;
		case 9:
				name= "Nine";
					break;
		case 10: 
				name= "Jack";
					break;
		case 11:
				name= "Queen";
					break;
		case 12:
				name= "King";
					break;
		case 13: 
				name = "Ace";
					break; 
		
		}
		
		
	}
/*
 *    Getters & Setters
 */
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
		
	}
	
	/*
	 *  Description of Card
	 */
	public String describe () { 
		System.out.println ("Card" + value + "of "+ name);
		return name;
	
}
}

package DavidLe.ThinkInJava;

public class Deck {
	Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];
	}
	// bo bai con
	public static Deck subdeck(Deck deck, int low, int high) { 
	    Deck sub = new Deck(high-low+1); 
	    for (int i = 0; i<sub.cards.length; i++) { 
	      sub.cards[i] = deck.cards[low+i]; 
	    } 
	    return sub; 
	  }
	// tao ra 1 bo bai gom 52 la
	public Deck() { 
	    this.cards = new Card[52]; 
	    int index = 0; 
	    for (int suit = 0; suit <= 3; suit++) { 
	      for (int rank = 1; rank <= 13; rank++) { 
	        cards[index] = new Card(suit, rank); 
	        index++; 
	      } 
	    } 
	  }
}

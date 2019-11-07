package DavidLe.ThinkInJava;

public class Card {
	int suit, rank;
	public static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	public static String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };

	public static void printCard(Card c) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Card() {
		this.suit = 0;
		this.rank = 0;
	}

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public static int compareCard(Card card1, Card card2) {

		if (card1.rank > card2.rank)
			return 1;
		if (card1.rank < card2.rank)
			return -1;
		else {
			if (card1.suit > card2.suit)
				return 1;
			if (card1.suit < card2.suit)
				return -1;
		}
		return 0;
	}

	public static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			printCard(cards[i]);
		}
	}

	public static boolean sameCard(Card c1, Card c2) {
		return (c1.suit == c2.suit && c1.rank == c2.rank);
	}

	public static int findBisect(Card[] cards, Card card, int low, int high) {
		System.out.println(low + ", " + high);
		if (high < low)
			return -1;
		int mid = (high + low) / 2;
		int comp = compareCard(cards[mid], card);
		if (comp == 0) {
			return mid;
		} else if (comp > 0) {
			return findBisect(cards, card, low, mid - 1);
		} else {
			return findBisect(cards, card, mid + 1, high);
		}
	}

	public static void main(String[] args) {

	}
}

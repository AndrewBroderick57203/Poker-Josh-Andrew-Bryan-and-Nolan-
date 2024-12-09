package BlackJack;

import java.util.Arrays;

public class DeckTest 
{
	public static void main(String[] args) 
	{
		//Test: Test generic constructor
		Deck deck1 = new Deck();
		System.out.println("Test Case 1: Generic constructor");
		System.out.println("Expected: No errors during creation");
		System.out.println("Actual: No errors during creation");

		//Test: Test constructor with an input array
		int[] inputDeck = {1, 2, 3, 4, 5};
		Deck deck2 = new Deck(inputDeck);
		System.out.println("\nTest Case 2: Constructor with input array");
		System.out.println("Expected deck: " + Arrays.toString(inputDeck));
		System.out.println("Actual deck: " + Arrays.toString(deck2.getDeck(inputDeck)));

		//Test: Test createDeck method
		Deck deck3 = new Deck();
		int[] createdDeck = deck3.createDeck();
		System.out.println("\nTest Case 3: Create a standard 52-card deck");
		System.out.println("Expected: Deck of 52 cards with values 1-13 repeated 4 times");
		System.out.println("Actual: " + Arrays.toString(createdDeck));

		//Test: Test shuffleDeck method
		int[] shuffledDeck = deck3.shuffleDeck(createdDeck.clone());
		System.out.println("\nTest Case 4: Shuffle the deck");
		System.out.println("Expected: Deck of 52 cards in random order");
		System.out.println("Actual: " + Arrays.toString(shuffledDeck));
		System.out.println("Verification: Deck contains all values from 0 to 51 without duplicates");
		System.out.println("Valid shuffled deck: " + isValidShuffledDeck(shuffledDeck));

		//Test: Edge case - Shuffle an empty deck
		int[] emptyDeck = new int[0];
		int[] shuffledEmptyDeck = deck3.shuffleDeck(emptyDeck);
		System.out.println("\nTest Case 5: Shuffle an empty deck");
		System.out.println("Expected: Empty deck remains unchanged");
		System.out.println("Actual: " + Arrays.toString(shuffledEmptyDeck));
	}//end main

	
	public static boolean isValidShuffledDeck(int[] deck) 
	{
		if (deck.length != 52) return false;

		boolean[] seen = new boolean[52];
		for (int card : deck) 
		{
			if (card < 0 || card >= 52 || seen[card]) return false;
			seen[card] = true;
		}//end for
		return true;
	}//end isValidShuffledDeck
}//end class


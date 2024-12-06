package BlackJack;

import java.util.ArrayList;

public class Deck
{
	private int [] deck;

	public Deck()
	{

	}//end generic constructor

	public Deck(int [] deck)
	{
		this.deck = deck;
	}//end int

	public int [] getDeck(int [] deck)
	{
		return deck;
	}//end getValue

	public int [] createDeck()
	{
		int [] newDeck = new int [52];

		for(int i = 0; i<4; i++)
		{
			for(int x = 0; x<13; x++)
			{
				if(x<10)
				{
					
				}
				newDeck [x] = x+1;
			}//end for
		}//end for

		this.deck = newDeck;

		return deck;
	}//end createDeck

	public int[] shuffleDeck(int[] deck)
	{
		ArrayList<Integer> cards = new ArrayList<Integer>();
		for(int i = 0;i<52;i++)
		{
			cards.add(i);
		}
		for(int i = 0;i<52;i++)
		{
			int variable = (int)(Math.floor(Math.random()*cards.size()));
			deck[i] = cards.get(variable);
			cards.remove(variable);
		}
		return deck;
	}//end shuffleDeck

}//end Deck Class

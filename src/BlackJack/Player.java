package BlackJack;

import java.util.ArrayList;

public class Player {
	private ArrayList<Integer> cards = new ArrayList<Integer>();
	public Player(int[] cards) 
	{
		for(int i = 0;i<cards.length;i++) 
		{
			this.cards.add(cards[i]);
		}
	}
	public void addcard(int NewCard) 
	{
		this.cards.add(NewCard);
	}
	public int getScore() 
	{
		int score = 0;
		for(int i:this.cards) 
		{
			score+=i%13+1;
		}
		return score;
	}
	public int[] showHand() 
	{
		int[] cardArray = new int[this.cards.size()];
		int j = 0;
		for(int i:this.cards) 
		{
			cardArray[j] = i;
			j+=1;
		}
		return cardArray;
	}
	public void clearHand() 
	{
		for(int i=0; i<this.cards.size();i++) 
		{
			this.cards.remove(0);
		}
	}
}	

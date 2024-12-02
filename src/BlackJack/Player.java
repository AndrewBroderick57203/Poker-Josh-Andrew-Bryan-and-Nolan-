package BlackJack;

import java.util.ArrayList;

public class Player {
	//
	private ArrayList<Integer> cards = new ArrayList<Integer>();
	/**Defines player
	 * @param cards The players cards
	 */
	public Player(int[] cards) 
	{
		for(int i = 0;i<cards.length;i++) 
		{
			this.cards.add(cards[i]);
		}
	}// End Player
	
	/**Adds a card to the players hand
	 * @param NewCard the card to be added
	 */
	public void addCard(int NewCard) 
	{
		this.cards.add(NewCard);
	}// End addCard
	
	/**Calculates and RETURNS the player score
	 * @return the player score obviously
	 */
	public int getScore() 
	{
		//Calculation stuff
		int score = 0;
		for(int i:this.cards) 
		{
			score+=i%13+1;
		}
		//Returns score
		return score;
	}// End getScore()
	
	/**
	 * @return
	 */
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
	}//End showHand()
	
	/**
	 * 
	 */
	public void clearHand() 
	{
		for(int i=0; i<this.cards.size();i++) 
		{
			this.cards.remove(0);
		}
	}//End clearHand()
}

package BlackJack;

import java.util.ArrayList;

public class Player {
	//cards array for the player
	private ArrayList<Integer> cards = new ArrayList<Integer>();
	
	/**Defines player with a blank hand
	 */
	public Player() 
	{
		
	}// End Player
	
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
		int aces = 0;
		// Handling most cards
		for(int i:this.cards) 
		{
			//Ace
			if(i%13 == 0) 
			{
				//Save it for later
				aces += 1;
			}
			//Face Card
			else if(i%13>9) 
			{
				score+=10;
			}
			//Number Card
			else
			{
				score+=i%13+1;
			}
		}
		//Ace Handling as they have 2 possible values and thus must be dealt with last
		for(int i = 0;i<aces;i++) 
		{
			//Making the aces get the player as close as possible to 21 but below or equal
			if(score<12-aces) 
			{
				score+=11;
			}
			else 
			{
				score+=1;
			}
		}
		//Returns score
		return score;
	}// End getScore()
	
	/**Returns an array of the current cards
	 * @return array of the size of the # of cards
	 */
	public int[] showHand() 
	{
		//Makes int array and fills them with the cards
		int[] cardArray = new int[this.cards.size()];
		int j = 0;
		for(int i:this.cards) 
		{
			cardArray[j] = i;
			j+=1;
		}
		//Returns int array of da cards!!!!!!!
		return cardArray;
	}//End showHand()
	
	/**
	 * Empties the players hand
	 */
	public void clearHand() 
	{
		//Deletes ALL OF THE CARDS!
		for(int i=0; i<this.cards.size();i++) 
		{
			this.cards.remove(0);
		}
	}//End clearHand()
}

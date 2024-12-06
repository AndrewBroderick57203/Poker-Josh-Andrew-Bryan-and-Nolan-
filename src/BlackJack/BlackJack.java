package BlackJack;

import java.util.*;


public class BlackJack {
	private String PrintDaCards(int[] cards) 
	{
		String cardsString = "";
		for(int i = 0;i<cards.length;i++) 
		{
			if(Math.floor(cards[i]/13) == 0) 
			{
				cardsString += "♥";
			}
			else if(Math.floor(cards[i]/13) == 1) 
			{
				cardsString += "♦";
			}
			else if(Math.floor(cards[i]/13) == 2) 
			{
				cardsString += "♣";
			}
			else if(Math.floor(cards[i]/13) == 3) 
			{
				cardsString += "♠";
			}
			if(cards[i]%13 == 0) 
			{
				cardsString += "A";
			}
			if(cards[i]%13 == 10) 
			{
				cardsString += "J";
			}
			if(cards[i]%13 == 11) 
			{
				cardsString += "Q";
			}
			if(cards[i]%13 == 12) 
			{
				cardsString += "K";
			}
			else
			{
				cardsString += Integer.toString(cards[i]%13);
			}
		}
		return cardsString;
	}// End PrintDaCards()
	public static void main(String[] args)
	{
		Scanner usrinput = new Scanner(System.in);
		//create new Deck
		//create new Player
		Player MyGuy = new Player();
		//create new Dealer
		Player TheBigDeal = new Player();
		//Initial dealing
		MyGuy.addCard(0);
		MyGuy.addCard(0);
		TheBigDeal.addCard(0);
		TheBigDeal.addCard(0);
		
		boolean playing = true;
		while (playing) 
		{ 
			boolean GameRun = true;
			while(GameRun) 
			{
				//Player's turn
				System.out.println("YOUR TURN!");
				System.out.println(MyGuy.showHand());
				System.out.println(MyGuy.getScore());

				if (MyGuy.getScore() > 21) 
				{
					System.out.println("You lose!");
					GameRun = false;
					break;
				}
		
				System.out.println("Do you want to (h)it or (s)tand?");
				String choice = usrinput.nextLine();
				if (choice.equals("h")) 
				{
					MyGuy.addCard(0);
				} 
				// Dealer's turn
				System.out.println("THE BIG DEAL'S TURN");
				System.out.println(TheBigDeal.showHand());
				System.out.println(TheBigDeal.getScore());

				if (TheBigDeal.getScore() > 21) 
				{
					System.out.println("You win!");
					GameRun = false;
					break;
				}
				if (TheBigDeal.getScore()<15)
				{
					TheBigDeal.addCard(0);
				} 
			}
			System.out.println("Do you want to play again? (y/n)");
			if(usrinput.nextLine().equals("n")) 
			{
				playing = false;
			}
		}
	}
}// End BlackJack

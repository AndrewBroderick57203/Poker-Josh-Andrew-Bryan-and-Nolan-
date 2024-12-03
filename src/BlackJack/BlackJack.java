package BlackJack;

import java.util.*;


public class BlackJack {
	private String PrintDaCards(int[] cards) 
	{
		String cardsString = "";
		for()
		return "clubs (♣), diamonds (♦), hearts (♥), and spades (♠)";
	}
	public static void main(String[] args)
	{
		Scanner usrinput = new Scanner(System.in);
		//create new Deck
		//create new Player
		Player MyGuy = new Player();
		//create new Dealer
		Player TheBigDeal = new Player();
		/* Initial dealing
		MyGuy.addCard(CARD);
		MyGuy.addCard(CARD);
		TheBigDeal.addCard(CARD);
		TheBigDeal.addCard(CARD);
		*/
		boolean playing = true;
		boolean playerBust = false;
		while (playing) 
		{
		}
			System.out.println(MyGuy.showHand());
			System.out.println(MyGuy.getScore());

		/*if (player score > 21) 
		{
			print “You win!”
			playerBust = true
			break
		}*/

		/*print "Do you want to (h)it or (s)tand? "
		String choice = scanner.nextLine()
		if (choice = “h”) 
		{
			add card to player from deck;
		} else 
		{
			break
		}*/
		//}

		// Dealer's turn
		/*if (player haven’t bust) 
		{
			while (dealer score < 17) 
			{
				add card to dealer
			}

			// Show results
			show dealer hand
			print dealer score

			// Determine winner
			if (dealer score > 21) 
			{
				print “Dealer bust! You win!”
			}
		}*/

	}
}

import java.util.Arrays;
import java.util.Random;

public class CardGame 
{
    public static String[] initializeDeck() 
	{
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) 
		{
            for (String rank : ranks) 
			{
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }

    public static void shuffleDeck(String[] deck) 
	{
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) 
		{
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) 
	{
        if (numCards % numPlayers != 0) 
		{
            System.out.println("Cannot distribute cards equally among players.");
            return null;
        }
        
        String[][] players = new String[numPlayers][numCards / numPlayers];
        
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) 
		{
            for (int j = 0; j < numCards / numPlayers; j++) 
			{
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    public static void printPlayersCards(String[][] players) 
	{
        if (players == null) return;

        for (int i = 0; i < players.length; i++) 
		{
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) 
	{
        String[] deck = initializeDeck();
        System.out.println("Deck initialized with " + deck.length + " cards.");

        shuffleDeck(deck);
        System.out.println("Deck shuffled.");

        int numCards = 52;  
        int numPlayers = 4; 
        String[][] players = distributeCards(deck, numCards, numPlayers);

        System.out.println("Cards distributed to players:");
        printPlayersCards(players);
    }
}

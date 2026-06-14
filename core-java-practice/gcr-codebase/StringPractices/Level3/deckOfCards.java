import java.util.Scanner;

public class deckOfCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = input.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
        
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        
        String[][] distributed = distributeCards(deck, cardsPerPlayer, players);
        if (distributed != null) {
            printCards(distributed);
        }
        
        input.close();
    }
    
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }
    
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        
        String[][] playersCards = new String[x][n];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }
    
    public static void printCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println("  - " + playersCards[i][j]);
            }
            System.out.println();
        }
    }
}

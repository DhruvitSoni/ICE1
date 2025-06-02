
/**
 * @ DhruvitSoni, 991809845
 * @date 2025-05-31
 */
import java.util.Random;
public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(suits[rand.nextInt(4)]); 
            magicHand[i] = c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(" Congratulations!");
        } else {
            System.out.println("Sorry!");
        }
        System.out.println("\nMagic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        System.out.println("\nLucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
    }
}


package card;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Navish Jindal - 991760581
 * Date :- May 23, 2025
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        // Filled the magicHand array with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        // Displayed the cards in the magicHand Array
        System.out.println("Magic Hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

//        // Asked the user for input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a card value (1-13): ");
//        int userValue = scanner.nextInt();
//        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
//        int userSuitIndex = scanner.nextInt();
//        String userSuit = Card.SUITS[userSuitIndex];
//
//        // Searched the user's input in the magicHand array
//        boolean cardFound = false;
//        for (Card c : magicHand) {
//            if (c.getValue() == userValue && c.getSuit().equals(userSuit)) {
//                cardFound = true;
//                break;
//            }
//        }
//
//        // Displayed the result
//        if (cardFound) {
//            System.out.println("Congratulations, your card was found inside the magic hand!");
//        } else {
//            System.out.println("Sorry, your card is not in the magic hand.");
//        }

        // Added 7 of SpadeS as Lucky Card and checked the lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7); // Hardcoded lucky card value
        luckyCard.setSuit("Spades"); // Hardcoded lucky card suit
        
         boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("WOW! You found the lucky card! The 7 of Spades!");
        } else {
            System.out.println("The lucky card was " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        }


    }
}

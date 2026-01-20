package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * Card Trick program that creates a hand of 7 random cards
 * and checks if a hard-coded lucky card is in the hand.
 *
 * Modified by: Dilpreet Kaur
 * Student Number: 991814127
 * Date Modified: 2026-01-20
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random rand = new Random();

        // Create 7 random cards
        for (int i = 0; i < hand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // 1–13
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            hand[i] = c;
        }

        // Hard-coded lucky card (GitHub edit requirement)
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        // Display hand
        System.out.println("Magic Hand:");
        for (Card c : hand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        // Search for lucky card
        boolean found = false;
        for (Card c : hand) {
            if (c.getValue() == luckyCard.getValue()
                    && c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\n Lucky card FOUND! You win!");
        } else {
            System.out.println("\n Lucky card not found. Try again!");
        }
    }
}

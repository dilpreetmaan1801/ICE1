package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * Card Trick program that creates a hand of 7 random cards
 * and checks if the user's chosen card is in the hand.
 *
 * Modified by: Dilpreet Kaur
 * Student Number: 991814127
 * Date Modified: 2026-01-20
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // Fill the hand with random cards (using setters)
        for (int i = 0; i < hand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // 1–13
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            hand[i] = c;
        }

        // User picks a card
        System.out.print("Pick a card value (1–13): ");
        int userValue = input.nextInt();

        System.out.print("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Show hand
        System.out.println("\nMagic Hand:");
        for (Card c : hand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        // Search for user's card
        boolean found = false;
        for (Card c : hand) {
            if (c.getValue() == userCard.getValue()
                    && c.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nYour card IS in the hand!");
        } else {
            System.out.println("\nYour card is NOT in the hand.");
        }

        input.close();
    }
}

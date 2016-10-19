/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

import java.awt.Color;

/**
 *
 * @author tatad6701
 */
public class Card {

    // Constants
    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 3;
    public static final int CLUBS = 2;
    // RANKS FOR FACE CARDS
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KINGS = 13;
    // Instance variables 
    private int suit;
    private int rank;
    private Color color;
    private boolean faceUp;

    /**
     * A constructor to create a new playing card
     *
     * @param suit This suit of the playing card
     * @param rank The rank of the playing card
     * @param faceUp Is the card faced up
     */
    public Card(int suit, int rank, boolean faceUp) {
        // Set these variables to be whatever is passed in!
        // Initializing instance variables
        this.suit = suit;
        this.rank = rank;
        this.faceUp = faceUp;

        // Initializing color
        if (this.suit == Card.SPADES || this.suit == CLUBS) {
            color = Color.black;
        } else {
            color = Color.RED;
        }
    }

    // GET STATEMENTS
    /**
     * Returns the suit of the playing card
     *
     * @return the suit of the playing card
     */
    // GetSuit method
    public int getSuit() {
        // Just return the suit
        return this.suit;
    }

    /**
     *
     * Return the rank of the playing card
     *
     * @return the rank of the playing card
     */
    public int getRank() {
        // Just return the rank
        return this.rank;
    }

    /**
     * Return the color of the playing card
     *
     * @return the color of the playing card
     */
    public Color getColour() {
        // Just return the colour
        return this.color;
    }

    /**
     * Return the playing card if faced up or not
     *
     * @return the playing card if faced up or not
     */
    public boolean isFaceUp() {
        // Just return if the face is up
        return this.faceUp;
    }

    /**
     * Compares the rank/value of 2 cards
     *
     * @param c the card to compare rank with
     * @return 0 means the cards are equivalent, less than 0 card is than c,
     * greater than 0 card is bigger than c
     */
    // CompareTo method
    // (This) is the first card AND (Card c)
    public int compareTo(Card c) {
        return this.rank - c.rank;
    }

    /**
     * Flips the card from face up to face down or visa-versa
     */
    public void flipCard() {
        // If the card is faced up
        if (this.faceUp == true) {
            // Flip card
            this.faceUp = false;
        } else {
            // Flip card
            this.faceUp = true;
        }
    }

    /**
     * Pretty String version of the Card
     *
     * @return a String representation of the card
     */
    // OVERINDING
    @Override
    public String toString() {
        String suit = "";
        if (this.suit == Card.SPADES) {
            suit = "Spades";
        } else if (this.suit == Card.CLUBS) {
            suit = "Clubs";
        } else if (this.suit == Card.HEARTS) {
            suit = "Hearts";
        } else if (this.suit == Card.DIAMONDS) {
            suit = "Diamonds";
        }
        return "Suit: " + suit + " " + "Rank: " + this.rank + " " + "FaceUp: " + this.faceUp;
    }
}

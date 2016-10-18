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

    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 3;
    public static final int CLUBS = 2;
    private int suit;
    private int rank;
    private Color color;
    private boolean faceUp;

    public Card(int suit, int rank, Color color, boolean faceUp) {
        this.suit = suit;
        this.rank = rank;
        this.color = color;
        this.faceUp = faceUp;
    }

    public int compareTo(Card a) {
        if () {
            
        }
    }

    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    public Color getColour() {
        return this.color;
    }

    public boolean isFaceUp() {
        return this.faceUp;
    }

    public boolean flipCard() {
        return this.faceUp;
    }
}

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
public class TestCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card a = new Card(Card.CLUBS,12, Color.RED, true);
        Card b = new Card(Card.SPADES,12, Color.BLACK, true);
        
        // Testing both cards
        System.out.println("What is the rank of the first card?");
        System.out.println(a.isFaceUp());
    }
}

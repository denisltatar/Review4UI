/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

import java.util.ArrayList;

/**
 *
 * @author tatad6701
 */
public class MyArrayList {

    // Insatance varaibles
    // To store things
    private int[] numbers;
    // Number of thins
    private int numThings;

    public MyArrayList() {
        // Create a blank array with 10 spots
        this.numbers = new int[10];
        // Set number of things to 0
        this.numThings = 0;
    }

    /**
     * Get the size of the list
     *
     * @return the size of the list
     */
    public int size() {
        return numThings;
    }

    /**
     * Returns if the list of items is empty
     *
     * @return true if empty
     */
    public boolean isEmpty() {
        return this.numThings == 0;
    }

    /**
     * Adds a new number to the list
     *
     * @param num the number to add to the list
     */
    public void add(int num) {
        // No room to add a number in
        if (this.numThings == this.numbers.length) {
            // Make a new array twice as big
            int[] temp = new int[this.numbers.length * 2];
            // Copy all the values
            for (int i = 0; i < this.numThings; i++) {
                temp[i] = this.numbers[i];
            }
            // Make the numbers array the same as temp
            this.numbers = temp;
            // Insert the new value
            this.numbers[numThings] = num;
            // Increase counter
            this.numThings++;
        } else {
            // Put number in the array
            this.numbers[this.numThings] = num;
            // Increase the counter
            this.numThings++;
        }
    }

    /**
     * Removes a number from the list
     *
     * @param num the number to remove
     */
    public void remove(int num) {
        // This goes through the array
        for (int i = 0; i < this.numThings; i++) {
            // If the number is found
            if (this.numbers[i] == num) {
                // Going through the entire set of elemnts to shuffle down
                while (i < this.numThings - 1) {
                    // Shuffling the numbers down
                    this.numbers[i] = this.numbers[i + 1];
                    i++;
                }
                // Decrease counter
                this.numThings--;
                // Stop searching
                break;
            }
        }
    }

    /**
     * Gets an item from the list
     *
     * @param i position in the list to get
     * @return the number at that position
     */
    public int get(int i) {
        // Make sure it is an actual item
        if (i >= this.numThings) {
            // Throw an erroe if not
            throw new IndexOutOfBoundsException();
        }
        return this.numbers[i];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        // Add some number
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(67);
        list.add(5);
        list.add(17);
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(7);

        // Remove some numbers
        list.remove(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // JAVA'S ARRAY LIST
        ArrayList<Integer> other = new ArrayList<>();
        other.add(7);
    }
}

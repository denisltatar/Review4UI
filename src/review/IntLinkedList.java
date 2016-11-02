/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author tatad6701
 */
public class IntLinkedList {
    // Number of things in list

    private int numThings;
    // Start of the list
    private IntNode head;

    /**
     * Constructor for a empty linked list
     */
    public IntLinkedList() {
        // Set number of things to be zero
        this.numThings = 0;
        // Start with nothing 
        this.head = null;
    }

    /**
     * Return the size of the list
     *
     * @return the number of items in the list
     */
    public int size() {
        // return the number of items in the list
        return this.numThings;
    }

    /**
     * Checks if the list is empty
     *
     * @return true if there is nothing in the list, false otherwise
     */
    public boolean isEmpty() {
        return this.numThings == 0;
    }

    /**
     * Add the number to the list
     *
     * @param num the number to add to the list
     */
    public void add(int num) {
        // Create the node for the number
        IntNode n = new IntNode(num);
        // Insert the node at the beginning
        // This is the first item
        if (this.numThings == 0) {
            head = n;
            this.numThings++;

        } else {
            // Set the new nodes next pointer
            n.setNext(head);
            // Set the heads items pervious 
            head.setPrev(n);
            // Se the new start of the list
            head = n;
            this.numThings++;
        }
    }

    /**
     * Gets an item from a specific position
     *
     * @param pos the position of the item
     * @return the item at the position
     */
    public int get(int pos) {
        // Throw an error if the position doesn't exist
        if (pos >= this.numThings) {
            throw new IndexOutOfBoundsException();
        }

        // Temporary node
        IntNode node = head;
        // Walk the nodes
        for (int i = 0; i < pos; i++) {
            node = node.next();
        }
        // Give them the number 
        return node.getNum();
    }

    public static void main(String[] args) {
        IntLinkedList myList = new IntLinkedList();

        // Add some numbers
        myList.add(7);
        myList.add(5);
        myList.add(-2);
        myList.add(50);

        // Print out the list
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}

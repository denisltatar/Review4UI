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

    /**
     * Find the node containing the number
     *
     * @param num the number in the node
     * @return the node containing the number
     */
    private IntNode findNode(int num) {
        // Start at the beginning
        IntNode temp = head;
        // Walk the list
        for (int i = 0; i < this.numThings; i++) {
            // Is this the node i'm looking for?
            if (temp.getNum() == num) {
                return temp;
            }
            // Move to the next node
            temp = temp.next();
        }
        // Haven't found a matching node 
        return null;
    }

    /**
     * Removes a number from the list
     *
     * @param num the number to remove from the list
     */
    public void remove(int num) {
        // Using helper to find the node!
        IntNode temp = this.findNode(num);
        // If there is a node!
        if (temp != null) {
            // Grab the node after and before
            IntNode next = temp.next();
            IntNode prev = temp.prev();
            // If there is a link to fix
            if (next != null) {
                // Se the nexxt node to point back to previous 
                next.setPrev(prev);
            }

            // A previous node to fix 
            if (prev != null) {
                prev.setNext(next);
            } else {
                // Fix the start of the list
                head = next;
            }

            // Remove 1 from counter
            this.numThings--;
        }
    }

    public static void main(String[] args) {
        IntLinkedList myList = new IntLinkedList();

        // Add some numbers
        myList.add(7);
        myList.add(5);
        myList.add(-2);
        myList.add(5);


        myList.remove(69);

        // Print out the list
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}

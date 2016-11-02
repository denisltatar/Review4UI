/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author tatad6701
 */
public class IntNode {
    // Integer it is storing

    private int num;
    // Next node link
    private IntNode next;
    // Previous node
    private IntNode prev;

    public IntNode(int num) {
        // The numbers being passed through
        this.num = num;
        this.next = null;
        this.prev = null;
    }

    public IntNode next() {
        return this.next;
    }

    public IntNode prev() {
        return this.prev;
    }

    public void setNext(IntNode n) {
        this.next = n;
    }

    public void setPrev(IntNode n) {
        this.prev = n;
    }

    public int getNum() {
        return this.num;
    }
}

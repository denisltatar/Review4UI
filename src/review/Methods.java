/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author tatad6701
 */
public class Methods {
    // Calculate the area of a circle 
    public double circleArea(double radius) {
        double answer = Math.PI * radius * radius;
        // Return the answer
        return answer;
    }

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fact(int n) {
        // First two fib numbers are 1 and 1
        if (n == 0 || n == 1) {
            // Return 1
            return 1;
        }
        // Anthing else? 2 times 1!
        return n * fact(n - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Add a new method (Allows us to use antyhing within a class)
        Methods test = new Methods();
        // Create a double to 'test' and add radius
        double area = test.circleArea(3);
        System.out.println("Area: " + area);

        // What is the 5th fibonacci number?
        System.out.println(test.fib(5));
    }
}

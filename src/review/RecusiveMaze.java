/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author tatad6701
 */
public class RecusiveMaze {

    // Print the method // SAME AS ASTERICKS QUESTION!
    public void printMaze(char[][] maze) {
        // Go through every row
        for (int row = 0; row < maze.length; row++) {
            // Go though column
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println("");
        }
    }

    public boolean solveMaze(char[][] maze, int row, int col) {
        // Bad conditions
        // Not even in the maze
        if (row < 0 || row >= maze.length) {
            return false;
        }
        // Not even in the maze
        if (col < 0 || col >= maze.length) {
            return false;
        }
        // Can't move to this spot(Hit a wall and hit a spot that it has already been to)
        if (maze[row][col] == 'X' || maze[row][col] == '+') {
            return false;
        }
        // Winning condition: Found the exit
        if (maze[row][col] == 'E') {
            // Found the exit
            return true;
        }

        // Mark spot as visited
        maze[row][col] = '+';
        // Try north
        // Try path with new row, if successful, then it is done
        if (solveMaze(maze, row - 1, col)) {
            return true;
        }

        // Try east
        if (solveMaze(maze, row, col + 1)) {
            return true;
        }

        // Try south
        if (solveMaze(maze, row + 1, col)) {
            return true;
        }

        // Try west
        if (solveMaze(maze, row, col - 1)) {
            return true;
        }

        // Tried every direction = NO GOOD!
        // "Unvisit" the spot
        maze[row][col] = '.';
        return false;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecusiveMaze test = new RecusiveMaze();

        // X - wall, . - space, E - end, + - path 
        char[][] maze = {
            {'X', 'X', 'X', '.', 'X', '.', '.', 'X', 'X', 'X'},
            {'S', '.', 'X', '.', '.', '.', 'X', 'X', 'X', 'X'},
            {'X', '.', 'X', '.', 'X', '.', 'X', '.', 'X', 'X'},
            {'X', '.', '.', '.', 'X', '.', 'X', '.', 'X', 'X'},
            {'X', '.', 'X', 'X', 'X', '.', '.', '.', 'X', 'X'},
            {'X', '.', 'X', 'X', 'X', 'X', 'X', '.', 'X', 'X'},
            {'X', '.', '.', '.', 'X', 'X', 'X', '.', '.', 'X'},
            {'X', 'X', '.', 'X', 'X', 'X', 'X', 'X', '.', 'E'},
            {'X', 'X', '.', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', '.', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}
        };
        test.printMaze(maze);
        if (test.solveMaze(maze, 1, 0)) {
            System.out.println("Solved the maze! Check this puppy out!");
            test.printMaze(maze);
        } else {
            System.out.println("Failed to solve the maze!");
        }
    }
}

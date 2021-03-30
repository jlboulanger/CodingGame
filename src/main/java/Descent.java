import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Descent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int maxH =0;
        int maxHIndex=0;
        // game loop
        while (true) {
            maxH = 0;
            maxHIndex=0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH > maxH) {
                    maxH = mountainH;
                    maxHIndex=i;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(maxHIndex); // The index of the mountain to fire on.
        }
    }
}

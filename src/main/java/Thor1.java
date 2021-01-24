import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Thor1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        /*
        0 ≤ lightX < 40
0 ≤ lightY < 18
0 ≤ initialTX < 40
0 ≤ initialTY < 18
         */
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            String res = "";
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (lightX > initialTx && lightY > initialTy) {
                res = "SE";
                initialTx++;
                initialTy++;
            } else if (lightX > initialTx && lightY < initialTy) {
                res = "NE";
                initialTx++;
                initialTy--;
            } else if (lightX > initialTx) {
                res = "E";
                initialTx++;
            } else if (lightX == initialTx && lightY > initialTy) {
                res = "S";
                initialTy++;
            } else if (lightX == initialTx) {
                res = "N";
                initialTy--;
            } else if (lightY > initialTy) {
                res = "SW";
                initialTx--;
                initialTy++;
            } else if (lightY < initialTy) {
                res = "NW";
                initialTx--;
                initialTy--;
            } else {
                res = "W";
                initialTx--;
            }

            //proper solution:
            /*
            String path = "";
            if ( initialTY < lightY ) { path += "S"; initialTY++; };
            if ( initialTY > lightY ) { path += "N"; initialTY--; };
            if ( initialTX < lightX ) { path += "E"; initialTX++; };
            if ( initialTX > lightX ) { path += "W"; initialTX--; };
             */


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(res);
        }
    }
}

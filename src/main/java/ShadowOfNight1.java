import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class ShadowOfNight1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        // game loop
        int startx = 0;
        int starty = 0;
        W = W-1;
        H = H-1;
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            //starting point new array

            if ("U".equals(bombDir)) {
                H = Y0 - 1;
            } else if ("UR".equals(bombDir)) {
                startx = X0 + 1;
                H = Y0 - 1;
            } else if ("R".equals(bombDir)) {
                startx = X0 + 1;
            } else if ("DR".equals(bombDir)) {
                startx = X0 + 1;
                starty = Y0 + 1;
            } else if ("D".equals(bombDir)) {
                starty = Y0 + 1;
            } else if ("DL".equals(bombDir)) {
                starty = Y0 + 1;
                W = X0 - 1;
            } else if ("L".equals(bombDir)) {
                W = X0 - 1;
            } else { //UL
                H = Y0 - 1;
                W = X0 - 1;
            }

            X0 = startx + (W - startx)/2;
            Y0 = starty + (H - starty)/2;


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // the location of the next window Batman should jump to.
            System.out.println(X0 +" "+ Y0);
        }
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class Temperatures {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int res = n == 0 ? 0 : Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if (Math.abs(t) < Math.abs(res)) {
                res = t;
            } else if (Math.abs(t) == Math.abs(res)) {
                res = Math.max(res, t);
            }
        }
        /*
         int result = n == 0 ? 0 : Arrays.stream(in.nextLine().split(" "))
            .map(a -> Integer.parseInt(a))
            .sorted((a,b) -> abs(a) != abs(b) ? abs(a)-abs(b) : b-a)
            .iterator().next();

         */

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(res);
    }
}

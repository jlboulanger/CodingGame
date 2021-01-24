import java.util.*;
import java.io.*;
import java.math.*;
public class FindImage {

    public static int[] solve(int imageWidth, int imageHeight, String[] image, int patternWidth, int patternHeight, String[] pattern) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int res[] = new int[] {-1, -1};
        int patternOffset = 0;
        boolean partialFound = false;
        for (int i = 0; i < imageHeight; i++) {
            if(patternOffset < patternHeight) {
                int start = image[i].indexOf(pattern[patternOffset]);
                if (start >= 0) {
                    if (!partialFound) {
                        res[0] = start;
                        res[1] = i;
                        partialFound = true;
                    }
                    patternOffset++;
                } else {
                    patternOffset = 0;
                    partialFound = false;
                }
            }

        }
        return res;
    }
}

class Pi {

    /**
     *
     */
    static double approx(double[][] pts) {
        long count = Arrays.stream(pts).filter(i -> Math.pow(i[0],2) + Math.pow(i[1], 2) < 1).count();
        return 0d;
    }
}

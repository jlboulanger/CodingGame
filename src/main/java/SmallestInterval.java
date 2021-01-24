import java.util.*;
import java.io.*;
import java.math.*;

public class SmallestInterval {
    public static int findSmallestInterval(int[] numbers) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int res =  Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (Math.abs(numbers[i]) == Math.abs(numbers[j])) {
                    res = 0;
                    break;
                }
                if (res > Math.abs((numbers[i] - numbers[j]))) {
                    res = Math.abs(numbers[i] - numbers[j]);
                }
            }
        }
        //Arrays.stream(numbers).sorted().

        return res;
    }
}

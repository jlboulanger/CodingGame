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

    public static String webnet(int[] array) {
        return Arrays.stream(array).boxed().map( i ->
            i % 3 == 0 ? "Web" : (i % 5 == 0 ? "Net" : String.valueOf(i))
        ).reduce("", (a, b) -> a + b);
    }

    static int findLargest(int[] numbers) {
        return Arrays.stream(numbers).boxed().sorted((a,b) -> b -a).findFirst().get();
    }

    public static String reshape(int n, String str) {
        String res = str.replaceAll("\\s", "");
        IntStream.rangeClosed(0, res.length() - n).mapToObj(i -> str.substring(i, i +n);

        return res;
    }

    public static List recopieElementsApresJava8(List<String> elements){
        //Après Java 8 :
        List elementsToReturn = new ArrayList<String>();

        //insérer ici un code équivalent au code ci dessus
        //en utilisant les fonctionnalités de Java 8
        return elements.stream().filter(s -> s.matches("[^aA]*")).collect(Collectors.toList());


    }

    public static int computeMultiplesSum(int n) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        return IntStream.rangeClosed(1, n).filter(i -> (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0))
                .reduce(0, (a, b) -> a + b);

    }
}

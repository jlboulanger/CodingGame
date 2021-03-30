import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MiscExo {
    public static String webnet(int[] array) {
        return Arrays.stream(array).boxed().map(i ->
                i % 3 == 0 ? "Web" : (i % 5 == 0 ? "Net" : String.valueOf(i))
        ).reduce("", (a, b) -> a + b);
    }

    static int findLargest(int[] numbers) {
        return Arrays.stream(numbers).boxed().sorted((a,b) -> b -a).findFirst().get();
    }

    public static String reshape(int n, String str) {
        String res = str.replaceAll("\\s", "");
        IntStream.rangeClosed(0, res.length() - n).mapToObj(i -> str.substring(i, i +n));

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

    public static int closestZero(int[] ints) {
        if (ints == null || ints.length == 0) return 0;
        int closestZero = Integer.MAX_VALUE;
        for (int anInt : ints) {
            if (Math.abs(anInt) < Math.abs(closestZero)) {
                closestZero = anInt;
            } else if (Math.abs(anInt) == Math.abs(closestZero)) {
                closestZero = Math.abs(anInt);
            }
        }
        return closestZero;
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class MIMETypes {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        SortedMap<String, String> types = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            types.put(EXT, MT);
        }
        in.nextLine();
        int lastIndex;
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            //split get extension
            lastIndex = FNAME.lastIndexOf('.');
            if (lastIndex >= 0 && lastIndex + 1 < FNAME.length()) {
                System.out.println(
                        types.getOrDefault(FNAME.substring(lastIndex + 1), "UNKNOWN")
                );
            } else {
                System.out.println("UNKNOWN");
            }

        }
    }
}

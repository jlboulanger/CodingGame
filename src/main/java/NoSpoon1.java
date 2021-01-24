import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class NoSpoon1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        if (in.hasNextLine()) {
            in.nextLine();
        }
        char[][] nodeMatrix = new char[height][width];
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            nodeMatrix[i] = line.toCharArray();
        }
        for (int i =0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                StringBuilder res = new StringBuilder();
                boolean foundRight = false;
                boolean foundDown = false;
                if (nodeMatrix[i][j] == '0') {
                    res.append(j).append(" ").append(i).append(" ");
                    for(int nextj = j+1; nextj < width; nextj++) {
                        if (nodeMatrix[i][nextj] == '0') {
                            res.append(nextj).append(" ").append(i).append(" ");
                            foundRight = true;
                            break;
                        }
                    }
                    if(!foundRight) {
                        res.append(-1).append(" ").append(-1).append(" ");
                    }

                    for(int nexti = i+1; nexti < height; nexti++) {
                        if(nodeMatrix[nexti][j] == '0') {
                            res.append(j).append(" ").append(nexti).append(" ");
                            foundDown = true;
                            break;
                        }
                    }
                    if(!foundDown) {
                        res.append(-1).append(" ").append(-1).append(" ");
                    }
                    /*int nexti = i+1;
                    int nextj = j+1;
                    while (nexti < height) {
                        if(nodeMatrix[nexti][j] == '0') {
                            break;
                        }
                        nexti++;
                    }
                    while (nextj < width) {
                        if(nodeMatrix[i][nextj] == '0') {
                            break;
                        }
                        nextj++;
                    }
                    if(nextj >= width) {
                        res.append(-1).append(" ").append(-1).append(" ");
                    } else {
                        res.append(nextj).append(" ").append(i).append(" ");
                    }
                    if(nexti >= height) {
                        res.append(-1).append(" ").append(-1).append(" ");
                    } else {
                        res.append(j).append(" ").append(nexti).append(" ");
                    }*/

                    System.out.println(res.toString());
                }
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // Three coordinates: a node, its right neighbor, its bottom neighbor

    }
}

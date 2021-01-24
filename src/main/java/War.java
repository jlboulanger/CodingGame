import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class War {

    private static String battle(Deque<Card> deck1, Deque<Card> deck2, Deque<Card> prize1, Deque<Card> prize2, boolean atWar, int nbRound) {
        if (atWar) {
            System.err.println("war round: " + nbRound + " deck1 empty ?  " + deck1.isEmpty() + ", deck2 empty ? " + deck2.isEmpty());
        } else {
            System.err.println("battle round: " + nbRound + " deck1 empty ?  " + deck1.isEmpty() + ", deck2 empty ? " + deck2.isEmpty());
        }

        if (atWar) {
            if (deck1.isEmpty() || deck2.isEmpty()) {
                return "PAT";
            }
        } else {
            if (deck1.isEmpty()) {
                return "2 " + nbRound;
            }
            if (deck2.isEmpty()) {
                return "1 " + nbRound;
            }
        }

        if (!atWar) {
            nbRound++;
        }

        Card c1 = deck1.getFirst();//get do not remove the card from the deck
        Card c2 = deck2.getFirst();
        System.err.println("-- c1 " + c1.faceValue + ", c2 : " + c2.faceValue);
        int battleResult = c1.compareTo(c2) ;
        System.err.println("battleResult " + battleResult);
        if (battleResult > 0) {
            System.err.println("battleResult adding to deck1 - war :" + atWar);
            deck1.addAll(prize1);
            deck1.addLast(deck1.pollFirst());
            deck1.addAll(prize2);
            deck1.addLast(deck2.pollFirst());
            //reset war variable
            atWar = false;
            prize1.clear();
            prize2.clear();
        } else if (battleResult < 0) {
            System.err.println("battleResult adding to deck2 - war " + atWar);
            deck2.addAll(prize1);
            deck2.addLast(deck1.pollFirst());
            deck2.addAll(prize2);
            deck2.addLast(deck2.pollFirst());
            //reset war variable
            atWar = false;
            prize1.clear();
            prize2.clear();
        } else {
            System.err.println("battleResult at war ");
            //war
            //adding card to pot
            //add next 4 (c1 + next 3 card) to prize
            int i = 0;
            while (i < 4 && !deck1.isEmpty()) {
                prize1.addLast(deck1.pollFirst());
                i++;
            }
            //same for deck2
            i = 0;
            while (i < 4 && !deck2.isEmpty()) {
                prize2.addLast(deck2.pollFirst());
                i++;
            }
            atWar = true;
        }

        return battle(deck1, deck2, prize1, prize2, atWar, nbRound);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Deque<Card> deck1 = new LinkedList<Card>();
        Deque<Card> deck2 = new LinkedList<Card>();
        int nbRound = 0;
        String res = "NONE";
        int n = in.nextInt(); // the number of cards for player 1
        for (int i = 0; i < n; i++) {
            deck1.addLast(new Card(in.next())); // the n cards of player 1
        }
        int m = in.nextInt(); // the number of cards for player 2
        for (int i = 0; i < m; i++) {
            deck2.addLast(new Card(in.next())); // the m cards of player 2
        }

        res = battle(deck1, deck2, new LinkedList<Card>(), new LinkedList<Card>(), false, nbRound);


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(res);
    }
}

class Card implements Comparable<Card> {
    int faceValue;
    String cardValue;

    public Card(String cardValue) {
        this.cardValue = cardValue;
        String tmpFaceValue = cardValue.substring(0, cardValue.length()-1);
        switch (tmpFaceValue) {
            case "J" : {
                faceValue = 11;
                break;
            }
            case "Q"  : { faceValue = 12;
                break;
            }
            case "K"  : { faceValue = 13;
                break;
            }
            case "A"  : { faceValue = 14;
                break;
            }
            default  : { faceValue = Integer.valueOf(tmpFaceValue);
                break;
            }
        }
    }

    @Override
    public int compareTo(Card o) {
        if (o == null) {
            return +1;
        }
        return this.faceValue - o.faceValue;
    }
}

package demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer,String> cardMap = new HashMap<Integer,String>();
        ArrayList<Integer>  cardNumber = new ArrayList<Integer>();
        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A","2"};

        int index = 0;

        for (String num : numbers) {
            for (String color : colors) {
                cardMap.put(index,color+num);
                cardNumber.add(index);
                index++;
            }
        }

        cardMap.put(index,"smallJoker");
        cardNumber.add(index);
        index++;
        cardMap.put(index,"bigJoker");
        cardNumber.add(index);

        Collections.shuffle(cardNumber);



        TreeSet<Integer> player1 = new TreeSet<Integer>();
        TreeSet<Integer> player2 = new TreeSet<Integer>();
        TreeSet<Integer> player3 = new TreeSet<Integer>();
        TreeSet<Integer> aHand = new TreeSet<Integer>();

        for (int i = 0; i < cardNumber.size(); i++) {
            Integer card = cardNumber.get(i);
            if (i >= cardNumber.size() - 3) {
                aHand.add(card);
            } else if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else if (i % 3 == 2) {
                player3.add(card);
            }
        }
        lookcard(player1, "player1",cardMap);
        lookcard(player2, "player2",cardMap);
        lookcard(player3, "player3",cardMap);
        lookcard(aHand, "aHand",cardMap);
    }
    public static void lookcard(TreeSet<Integer> player, String name,HashMap<Integer,String> cardMap) {
        System.out.print(name + " card is:");
        for(Integer index:player) {
            String card = cardMap.get(index);
            System.out.print(card+" ");
        }
        System.out.println();
    }

}

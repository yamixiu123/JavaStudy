package demo7;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> pokerCard = new ArrayList<String>();
        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                pokerCard.add(color + number);
            }
        }
        pokerCard.add("大王");
        pokerCard.add("小王");
        System.out.println(pokerCard);
        Collections.shuffle(pokerCard);
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> aHand = new ArrayList<String>();
        for (int i = 0; i < pokerCard.size(); i++) {
            String card = pokerCard.get(i);
            if (i == pokerCard.size() - 3) {
                aHand.add(card);
            } else if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else if (i % 3 == 2) {
                player3.add(card);
            }
        }
        lookcard(player1, "player1");
        lookcard(player2, "player2");
        lookcard(player3, "player3");
        lookcard(aHand, "aHand");
    }

    public static void lookcard(ArrayList<String> player, String name) {
        System.out.print(name + " card is:");
        System.out.print(player);
        System.out.println();
    }
}

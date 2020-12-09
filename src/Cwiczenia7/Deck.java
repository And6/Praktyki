package Cwiczenia7;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        this.init();
    }

    // Inicjalizuje
    public void init() {
        String symbol;
        String[] colors = {"Pik", "Karo", "Kier", "Trefl"};
        for(String color : colors) {
            for(int i = 2; i < 14; i++) {
                switch(i) {
                    case 11:
                        symbol = "J";
                        break;
                    case 12:
                        symbol = "Q";
                        break;
                    case 13:
                        symbol = "K";
                        break;
                    case 14:
                        symbol = "A";
                        break;
                    default:
                        symbol = Integer.toString(i);
                }
                deck.add(new Card(color, i, symbol));
            }
        }
    }

    public Card draw() {
        SecureRandom random = new SecureRandom();
        int index = random.nextInt();
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }

    public void print() {
        for(Card card : deck) {
            System.out.println(card.toString());
        }
    }
}
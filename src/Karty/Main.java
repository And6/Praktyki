package Karty;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        // Wypisnaie wsystkich kart znajdujących się w talii
        deck.print();
        // Wyciągnięcie jednej karty z talii i jej wypisanie
        Card wyciagnietaKarta = deck.draw();
        System.out.println(wyciagnietaKarta);
    }
}

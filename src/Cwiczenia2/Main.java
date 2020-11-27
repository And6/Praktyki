package Cwiczenia2;

public class Main {
    public static void main(String[] args) {

        //Zadanie: Posortuj tablice liczb całkowitych rosnąco

        int[] tab = {4,2,5,76,8,2,14,234,346,32,1};
        //Tablica przetrzymująca tablice wynikową
        int[] wynik = new int[tab.length];

        //Przechodziny po każdym elemencie tablicy wyników
        for (int j=0; j<wynik.length; j++) {

            //Zmienne pamiętające wartość i lokalizację najmniejszej wartości z tablicy
            int value = tab[0];
            int lokalizacja = 0;

            //pętla przechodząca po wszystkich elementach tablicy do sortowania
            for (int i = 1; i < tab.length; i++) {
                //Porównaj przechowywaną zmienną z kolejnym miejscem w tablicy, jeżeli jest mniejsza to zapomiętaj jego pozycję oraz wartość
                if (value > tab[i]) {
                    value = tab[i];
                    lokalizacja = i;
                }
            }
            //Wpisujemy do konkretnego miejsca w tablicy naszą wartość oraz ustawiamy go na maksymalną wartość inta (żeby go wykluczyć)
            wynik[j] = value;
            tab[lokalizacja] = Integer.MAX_VALUE;

            //Wypisujemy tablice wyników
            System.out.print(wynik[j] + ", ");
        }

    }
}

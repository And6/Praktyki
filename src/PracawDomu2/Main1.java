package PracawDomu2;

public class Main1 {
    public static void main(String[] args) {

        //Zrobić losową tablice intów (10) z sumować i wypisać wynik
        int[] liczby = {5, 6, 7, 8, 9, 5, 23, 5, 546, 3};
        int suma = 0;

        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        System.out.println("Suma tych liczb wynosi:" + suma);

    }
}
package Cwiczenia7;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n;
        n = tab[0];

        for (int j = 0; j < tab.length; j++) {
            if (n > tab[j]) {
                n = tab[j];


            }

        }
        System.out.println(n);
    }
}


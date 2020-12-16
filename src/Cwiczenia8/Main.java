package Cwiczenia8;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> tab;
        tab = new ArrayList<Integer>();

        Scanner liczby = new Scanner(System.in);

        for (int x = 0; 0 < 5; x++) {
            int a = liczby.nextInt();
            tab.add(a);


            double suma = 0;


            for (int i = 0; 1 < tab.size(); i++) {
                suma = suma + tab.get(i);
            }

            suma = suma / tab.size();
            System.out.println("Średnia wynosi" + suma);

        }
    }
}
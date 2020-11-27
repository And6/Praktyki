package PracawDomu1;

public class Tablica {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Liczbami parzystymi od 1 do "+n+" są: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

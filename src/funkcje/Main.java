package funkcje;
import java.util.Scanner;

public class Main {
    public static double obliczanie_funkcji_liniowej(double a, double b) {
        double x = -b/a;

        return x;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a = scanner.nextInt();
        System.out.println("Podaj b:");
        int b = scanner.nextInt();

        double funkcja = obliczanie_funkcji_liniowej(a, b);{
            System.out.print(funkcja);

        }

    }
}

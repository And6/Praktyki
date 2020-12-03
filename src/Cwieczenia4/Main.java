package Cwieczenia4;
import java.util.Scanner;

public class Main {
    public static double obliczenie_delty(double a, double b,double c){

        double delta = b*b + 4 + a + c;
        //int delta = b * b + 4 * a * c;

        return delta;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a,:");
        int a = scanner.nextInt();
        System.out.println("Podaj b:");
        int b = scanner.nextInt();
        System.out.println("Podaj c:");
        int c = scanner.nextInt();

        double delta = obliczenie_delty(a,b,c);
        //int delta = b * b + 4 * a * c;

        if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("x0 wynosi " + x0);
        } else if (delta > 0){
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 + x2 wynoszą " + x1 + " " + x2 + "delta wynosi:" + delta);
        }
        else if (delta < 0) {
            System.out.println("Brak rozwiązania"+ "delta wynosi" + delta);
        }
    }
}


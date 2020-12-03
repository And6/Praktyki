package funkcje;


public class main12 {
    public static int funkcja(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){

            }

        }

        return n;
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.print("Liczbami parzystymi od 1 do " + n + " są: ");
        int i = funkcja(n);
        {
            if (i % 2 == 0) {
                System.out.print(i + " ");


            }

        }
    }
}








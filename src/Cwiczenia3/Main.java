package Cwiczenia3;

public class Main {

    public static float funkcja_kwadratowa(float x) {
        return 2*x*x - 3*x + 4;
    }


    public static void print_table(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }


    }



    public static void main(String[] args) {
        System.out.println(funkcja_kwadratowa(5));
        int[] tab = {1,4,6,8,9,3,6,9,3,7,9,3};
        print_table(tab);

    }

}


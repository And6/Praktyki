package funkcje;

public class main2 {
    public static int suma(int[] tab){
        for (int i=0; i< tab.length; i++){
            System.out.print(tab[i] +",");
        }

    }


    public static void main(String[] args) {
        int[] tab = {1,2,3,5,4,6,7,8,9,10};
        suma(tab);
    }
}


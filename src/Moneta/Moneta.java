package Moneta;

import java.security.SecureRandom;

public class Moneta {

    public static int losowanie(){
        SecureRandom random = new SecureRandom();
        // Losowanie liczby
        int a = random.nextInt(2);

        return a;


    }

    public static void main(String[] args) {
        // Zainicjowanie funkcji
        int a = losowanie();
        // Jeżeli a = 1 wtedy program pokaże "Orzeł"
        if(a==1) {
            System.out.print("Orzeł");
        }
        // W innym przypadku program pokaże "Reszka"
        else {
            System.out.print("Reszka");
        }



    }
}









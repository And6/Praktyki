package Moneta;

import java.security.SecureRandom;

public class Moneta {

    public static int losowanie(){
        SecureRandom random = new SecureRandom();

        int a = random.nextInt(2);

        return a;


    }

    public static void main(String[] args) {

        int a =losowanie();
        if(a==1){
            System.out.print("Orzeł");
        }
        else {
            System.out.print("Reszka");
        }



    }
}









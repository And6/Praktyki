package Kostka;

import java.security.SecureRandom;

public class Kostka {
    int n;
    SecureRandom random;

    public Kostka(int n){
        this.n=n;
        random = new SecureRandom();
    }

    public int roll(){

        return this.random.nextInt(n) +1;
    }
}
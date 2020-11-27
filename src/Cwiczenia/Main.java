package Cwiczenia;

public class Main {
    public static void main(String[] args) {
        //Przykładowe typy zmiennych
        //Tu znajdziecie dobre źródło na temat zmiennych i ich typów: https://www.w3schools.com/java/java_variables.asp
        int zmiennai = 30;
        long zmiennal = 20;
        float zmiennaf = 1.0f;
        double zmiennad = 30.123123123123;
        boolean zmiennab = true;

        char zmiennac = 'K';
        String zmiennas = "Hello";
        String komunikat = new String("Hello World");


        //Przykład tablicy char (istnieją obiekty podobne do tablic)
        //Jeżeli ktoś nadal nie rozumie tablic zapraszam tutaj: https://www.w3schools.com/java/java_arrays.asp
        char[] tablicaChar = new char[5];
        tablicaChar[0] = 'H';
        tablicaChar[1] = 'e';
        tablicaChar[2] = 'l';
        tablicaChar[3] = 'l';
        tablicaChar[4] = 'o';

        int[] tablicaInt = {6, 344, 123, 73, 234, 876};


        //Przykład pętli for
        //for jest typową pętlą iteracyjną - łatwo sterowalną, bo macie zmienną iterującą, warunek i ciało po obiegu w tym samym miejscy
        for(int i = 0; i < 30; i++) {

            //Przykład instrukcji warunkowej
            //Tu znajdziecie więcej operatorów logicznych: https://www.w3schools.com/java/java_operators.asp
            if (0 < zmiennai) {
                zmiennai = -1;
            } else {
                zmiennai = 30;
            }
            System.out.println(zmiennai);
        }

        //Tu jest możliwość wykorzystania pętli foreach (nie omówiliśmy jej jeszcze)
        for (int i = 0; i < tablicaChar.length; i++){
            System.out.print(tablicaChar[i]);
        }

        //Przykład pętli while
        //While jest pętlą z argumentem - łatwo się tego używa, ale ciężej taką petlą sterować (iterator musicie obmyśleć sami, a zmiane warunku iteracji trzeba zawzreć w ciele pętli)
        int iteration = 0;
        while(iteration < 15){
            System.out.println(komunikat);
            iteration += 1;
        }

        //Przykład pętli do-while
        //Do-while zawsze wykonuje pierwszy obieg pętli
        boolean stopLoop = true;
        do{
            stopLoop = false;
            System.out.println("Wykonanie pętli");

        }while(stopLoop);

        //Operator modulo - reszta z dzielenia
        //Typy operatorów możecie znaleźć tutaj: https://www.w3schools.com/java/java_operators.asp      <- dobre źródło wiedzy plus możliwość wykonywania kodu "w biegu"
        int x = 40;
        x = x % 3;



        //Tu wypisuje jaki jest znak ASCII dla litery f
        //Gdy piszemy (typ zmiennej)zmienna to wymuszamy konwersję z jednego typu na inny
        System.out.println((int)'f');
    }
}

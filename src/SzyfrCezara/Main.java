package SzyfrCezara;
public class Main {

    public static String code(String wiadomosc) {


        char[] textchar = wiadomosc.toCharArray();

        for(int i=0; i<wiadomosc.length(); i++){
            if((textchar[i] >= 65 && textchar[i] <= 87) || (textchar[i] >= 97 && textchar[i] <= 119)){
                textchar[i] += 3;
            }
            switch(textchar[i]){
                case 'X': textchar[i] = 'A'; break;
                case 'Y': textchar[i] = 'B'; break;
                case 'Z': textchar[i] = 'C'; break;
                case 'x': textchar[i] = 'a'; break;
                case 'y': textchar[i] = 'b'; break;
                case 'z': textchar[i] = 'c'; break;
            }

        }
        String result = String.valueOf(textchar);
        return result;
    }
    public static void main(String[] args){
        String wiadomosc = "AaBbCcDd, XxYyZz, !.?<>";
        String result = code(wiadomosc);
        System.out.println("Wiadomosc : " + wiadomosc);
        System.out.println("Zaszyfrowana wiadomość : " + result);


    }
}
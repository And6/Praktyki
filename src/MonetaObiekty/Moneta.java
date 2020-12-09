package MonetaObiekty;
import java.security.SecureRandom;

public class Moneta {
    int Strony;
    SecureRandom random;

    public Moneta() {
        Strony = 2;
        random = new SecureRandom();
    }
    public String rzut(){
        int i = random.nextInt(Strony   );
        switch (i) {
            case 0:
                return "Orzeł";
            case 1:
                return "Reszka";
            default:
                return"";
        }
    }
}

package Cwiczenia6;

public class Czlowiek {

    private float wzrost;
    private float waga;
    private String imie;
    private String nazwisko;

    public Czlowiek(float wzrost, float waga, String imie, String nazwisko) {
        this.wzrost = wzrost;
        this.waga = waga;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public float getWzrost() {
        return wzrost;
    }

    public float getWaga() {
        return waga;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}
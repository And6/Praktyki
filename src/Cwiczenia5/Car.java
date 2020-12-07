package Cwiczenia5;

public class Car {
    private String model;
    private float pojemnoscsilnika;

    public Car(String model, float pojemnoscsilnika) {
       this.model = model;
       this.pojemnoscsilnika = pojemnoscsilnika;


    }
    public String getModel() {
        return "Model " + model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}

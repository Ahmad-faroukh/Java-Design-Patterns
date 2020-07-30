package DesignPattrens.Builder.ResturantEg;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Double price() {
        return 2.0;
    }
}

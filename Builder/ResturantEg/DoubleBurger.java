package DesignPattrens.Builder.ResturantEg;

public class DoubleBurger extends Burger {
    @Override
    public String name() {
        return "Double Burger";
    }

    @Override
    public Double price() {
        return 20.0;
    }
}

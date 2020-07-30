package DesignPattrens.Builder.ResturantEg;

public class CheeseBurger extends Burger {

    @Override
    public String name() {
        return "Cheese Burger";
    }

    @Override
    public Double price() {
        return 10.0;
    }
}

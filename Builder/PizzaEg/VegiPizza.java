package DesignPattrens.Builder.PizzaEg;

public class VegiPizza extends Pizza {

    @Override
    public String getSauce() {
        return "Hot Ketchup";
    }

    @Override
    public String getDough() {
        return "White Wheat";
    }

    @Override
    public String getTopping() {
        return "Cheese,Tomato,Sweet Pepper";
    }

    @Override
    public Double getCost() {
        return 19.99;
    }
}

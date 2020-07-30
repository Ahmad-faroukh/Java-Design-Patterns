package DesignPattrens.Builder.PizzaEg;

public class ChickenPizza extends Pizza {
    @Override
    public String getSauce() {
        return "Chicken Hot Sauce";
    }

    @Override
    public String getDough() {
        return "Grade A Wheat";
    }

    @Override
    public String getTopping() {
        return "Chicken,Cheese,Sweet Pepper";
    }

    @Override
    public Double getCost() {
        return 14.99;
    }
}

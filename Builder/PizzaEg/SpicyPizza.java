package DesignPattrens.Builder.PizzaEg;

public class SpicyPizza extends Pizza {
    @Override
    public String getSauce() {
        return "Hot Sauce";
    }

    @Override
    public String getDough() {
        return "Wheat Wheat";
    }

    @Override
    public String getTopping() {
        return "Bell Pepper,Tomato,Spicy Mix,Carolina Reaper";
    }

    @Override
    public Double getCost() {
        return 24.99;
    }
}

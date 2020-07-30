package DesignPattrens.Builder.PizzaEg;

public class PizzaBuilder {

    public ChickenPizza getChickenPizza(){
        return new ChickenPizza();
    }

    public SpicyPizza getSpicyPizza(){
        return new SpicyPizza();
    }

    public VegiPizza getVegiPizza(){
        return new VegiPizza();
    }
}
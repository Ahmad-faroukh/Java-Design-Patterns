package DesignPattrens.Builder.PizzaEg;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaBuilder();

        ChickenPizza chikenPizza = builder.getChickenPizza();
        SpicyPizza spicyPizza = builder.getSpicyPizza();
        VegiPizza vegiPizza = builder.getVegiPizza();

        System.out.println(vegiPizza.showPizzaInfo());
    }
}

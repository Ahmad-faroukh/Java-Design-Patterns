package DesignPattrens.Builder.ResturantEg;

public class Main {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal m1 = builder.cheseBurgerMeal();
        Meal m2 = builder.doubleBurgerMeal();
        m1.showItems();
        System.out.println("Cost "+m1.getCost());
    }
}

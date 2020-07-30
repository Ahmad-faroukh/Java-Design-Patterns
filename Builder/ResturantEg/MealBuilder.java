package DesignPattrens.Builder.ResturantEg;

public class MealBuilder {

    public Meal cheseBurgerMeal(){
        Meal meal = new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal doubleBurgerMeal(){
        Meal meal = new Meal();
        meal.addItem(new DoubleBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}

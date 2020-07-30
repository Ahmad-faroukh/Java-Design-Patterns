package DesignPattrens.Builder.ResturantEg;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item i){
        items.add(i);
    }

    public void showItems(){
        for (Item i : items) {
            System.out.print("Name: "+i.name()+" ");
            System.out.print("Packing: "+i.packing().pack()+" ");
            System.out.println("Price: "+i.price()+"$");
        }

    }

    public double getCost(){
        double cost = 0 ;

        for (Item i : items) {
            cost += i.price();
        }

        return cost;
    }
}
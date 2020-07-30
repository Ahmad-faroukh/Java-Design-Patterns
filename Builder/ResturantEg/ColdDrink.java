package DesignPattrens.Builder.ResturantEg;

public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }
}

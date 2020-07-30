package DesignPattrens.Builder.ResturantEg;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wraper();
    }
}

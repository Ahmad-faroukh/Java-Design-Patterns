package DesignPattrens.Builder.PizzaEg;

public abstract class Pizza {
    public abstract String getSauce();
    public abstract String getDough();
    public abstract String getTopping();
    public abstract Double getCost();
    public String showPizzaInfo(){
        return "Sauce : "+getSauce()+
                "\n"+"Dough : "+getDough()+
                "\n"+"Topping : "+getTopping()+
                "\n"+"Price : "+getCost()+"$";
    }

}

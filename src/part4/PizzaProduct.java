package part4;

import java.util.ArrayList;

public interface PizzaProduct {
    void addTopping(Topping topping);
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void cookPizza();
    double getPizzaPrice();
}

class Pizza implements PizzaProduct {
    protected ArrayList<Topping> toppings = new ArrayList<Topping>();
    protected Dough dough;
    protected Sauce sauce;

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public void setDough(Dough dough){
        this.dough = dough;
    }

    public void setSauce(Sauce sauce){
        this.sauce = sauce;
    }

    public void cookPizza(){
        System.out.println("Making a new Pizza...");
        dough.write();
        sauce.write();
        System.out.print("Added ");
        for(Topping topping : toppings){
            topping.write();
        }
        System.out.println();
    }

    public double getPizzaPrice(){
        double sum = 0.0;

        sum += dough.getPrice();
        sum += sauce.getPrice();
        for(Topping topping : toppings){
            sum += topping.getPrice();
        }

        return sum;
    }
}



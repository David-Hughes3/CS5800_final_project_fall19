package part4;

import java.util.ArrayList;

public class PizzaOrder{
    private ArrayList<Pizza> order;
    String customerName;

    PizzaOrder(String customerName){
        order = new ArrayList<Pizza>();
        this.customerName = customerName;
    }

    public void addToOrder(Pizza pizza){
        order.add(pizza);
    }

    public void cookOrder(){
        for(Pizza pizza: order){
            pizza.cookPizza();
        }
    }

    public PizzaOrderIterator createPriceIterator(){
        return new PizzaOrderIterator(){
            int currentIndex = 0;
            public Object getNext(){
                double nextPrice = order.get(currentIndex).getPizzaPrice();
                currentIndex += 1;
                return new Double(nextPrice);
            }
            public boolean hasNext(){
                return currentIndex < order.size();
            }
        };
    }

    public PizzaOrderIterator createDoughClassIterator(){
        return new PizzaOrderIterator(){
            int currentIndex = 0;
            public Object getNext(){
                Object objectClass = order.get(currentIndex).getClass();
                currentIndex += 1;
                return objectClass;
            }
            public boolean hasNext(){
                return currentIndex < order.size();
            }
        };
    }
}
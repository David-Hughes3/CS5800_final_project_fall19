package part4;

public class PizzaClient{

    public static Pizza orderDefaultPizza(PizzaAbstractFactory pizzaFactory){
        Pizza pizza = pizzaFactory.makePizza();
        pizza.setSauce(pizzaFactory.makeSauce());
        pizza.setDough(pizzaFactory.makeDough());
        pizza.addTopping(pizzaFactory.makeTopping());
        pizza.cookPizza();

        return pizza;
    }

    public static void orderTwoToppingPizza(String topping1, String topping2){
        RegularPizzaFactory pizzaFactory = new RegularPizzaFactory();
        Pizza pizza = pizzaFactory.makePizza();
        pizza.setSauce(pizzaFactory.makeSauce());
        pizza.setDough(pizzaFactory.makeDough());
        pizza.addTopping(pizzaFactory.makeTopping(topping1));
        pizza.addTopping(pizzaFactory.makeTopping(topping2));

        pizza.cookPizza();
    }

    public static void orderHalfAndHalfPizza(String leftTopping, String rightTopping){
        RegularPizzaFactory pizzaFactory = new RegularPizzaFactory();
        Pizza pizza = pizzaFactory.makePizza();
        pizza.setSauce(pizzaFactory.makeSauce());
        pizza.setDough(pizzaFactory.makeDough());

        Topping leftHalf = new SplitTopping(pizzaFactory.makeTopping(leftTopping), SplitTopping.Halves.LEFT);
        Topping rightHalf = new SplitTopping(pizzaFactory.makeTopping(rightTopping), SplitTopping.Halves.RIGHT);
        pizza.addTopping(leftHalf);
        pizza.addTopping(rightHalf);

        pizza.cookPizza();
    }

    public static void orderMultiplePizzasAndListPrice(String name, int numberOfRegular, int numberOfCookie){
        PizzaOrder order = new PizzaOrder(name);
        for(int i = 0; i < numberOfRegular; i++)
            order.addToOrder(orderDefaultPizza(new RegularPizzaFactory()));
        for(int i = 0; i < numberOfCookie; i++)
            order.addToOrder(orderDefaultPizza(new CookiePizzaFactory()));

        System.out.println("Cashier: The cost per pizza and total is: ");
        PizzaOrderIterator priceIterator = order.createPriceIterator();
        double sum = 0.0;
        int count = 0;
        while(priceIterator.hasNext()){
            Double price = (Double) priceIterator.getNext();
            sum += price;
            count += 1;
            System.out.println("Pizza " + count + ": " + price);
        }
        System.out.println("Total: " + sum);
    }

    public static void orderWithGlutenCheck(String customerName){
        RegularPizzaFactory pizzaFactory = new RegularPizzaFactory();
        Pizza pizza = pizzaFactory.makePizza();
        pizza.setSauce(pizzaFactory.makeSauce());
        pizza.setDough(pizzaFactory.makeDough());
        pizza.addTopping(pizzaFactory.makeTopping());

        PizzaOrder order = new PizzaOrder(customerName);
        order.addToOrder(pizza);

        PizzaOrderIterator doughIterator = order.createDoughClassIterator();
        boolean cancelOrder = false;
        while(doughIterator.hasNext()){
            Object nextDough = doughIterator.getNext();
            if(nextDough != GlutenFreeDough.class){
                cancelOrder = true;
            }
        }
        
        if(cancelOrder)
            System.out.println("This order contains gluten. Canceling order");
        else 
            order.cookOrder();
    }

}
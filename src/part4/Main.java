package part4;

public class Main {
	public static void main(String[] args) {

        System.out.println("\nCustomer 1: Hello, can I get a regular pizza?");
        PizzaClient.orderDefaultPizza(new RegularPizzaFactory());

        System.out.println("\nCustomer 2: Hello, can I get a cookie pizza?");
        PizzaClient.orderDefaultPizza(new CookiePizzaFactory());

        System.out.println("\nCustomer 3: Can I get a half pepperoni half sausage?");
        PizzaClient.orderHalfAndHalfPizza("pepperoni", "sausage");

        System.out.println("\nCustomer 4: Can I get 3 regular and 2 cookie pizzas?");
        PizzaClient.orderMultiplePizzasAndListPrice("Customer4", 3, 2);

        System.out.println("\nCustomer 5: Can I get a gluten free pizza please? I have Celiac disease");
        PizzaClient.orderWithGlutenCheck("Customer 5");
    }
}
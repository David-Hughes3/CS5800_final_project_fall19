package part4;

public class CookiePizzaFactory implements PizzaAbstractFactory{


    public Pizza makePizza(){
        return new Pizza();
    }

    public Dough makeDough(){
        return new CookieDough();
    }

    public Sauce makeSauce(){
        return new ChocolateSauce();
    }

    public Topping makeTopping(){
        return new IceCream();
    }

    public Topping makeTopping(String topping){
        if(topping.equals(null))
            return null;

        topping = topping.toLowerCase().replaceAll("\\s+","");

        switch(topping){
            case "icecream":
                return new IceCream();
            case "cherry":
                return new Cherry();
            default:
                throw new IllegalArgumentException(topping);
        }

    }
}
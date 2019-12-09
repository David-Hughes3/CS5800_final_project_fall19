package part4;

public class RegularPizzaFactory implements PizzaAbstractFactory{

    public Pizza makePizza(){
        return new Pizza();
    }

    public Dough makeDough(){
        return new NYStyleDough();
    }

    public Sauce makeSauce(){
        return new TomatoSauce();
    }

    public Topping makeTopping(){
        return new Pepperoni();
    }

    public Dough makeDough(String dough){
        if(dough.equals(null)) return null;
        dough = dough.toLowerCase().replaceAll("\\s+","");

        switch(dough){
            case "nystyle":
                return new NYStyleDough();
            case "glutenfree":
                return new GlutenFreeDough();
            default:
                throw new IllegalArgumentException(dough);
        }
    }

    public Sauce makeSauce(String sauce){
        if(sauce.equals(null)) return null;
        sauce = sauce.toLowerCase().replaceAll("\\s+","");

        switch(sauce){
            case "tomato":
                return new TomatoSauce();
            case "pesto":
                return new PestoSauce();
            default:
                throw new IllegalArgumentException(sauce);
        }
    }


    public Topping makeTopping(String topping){
        if(topping.equals(null)) return null;
        topping = topping.toLowerCase().replaceAll("\\s+","");

        switch(topping){
            case "pepperoni":
                return new Pepperoni();
            case "sausage":
                return new Sausage();
            default:
                throw new IllegalArgumentException(topping);
        }
    }
}
package part4;

public interface PizzaAbstractFactory{
    Pizza makePizza();
    Dough makeDough();
    Sauce makeSauce();
    Topping makeTopping();
}
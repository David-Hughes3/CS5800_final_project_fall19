package part4;

public abstract class Dough{
    protected double price;

    abstract void write();
    public double getPrice(){
        return this.price;
    }
}

class NYStyleDough extends Dough{
    NYStyleDough(){
        super.price = 3.00;
    }
    public void write(){
        System.out.println("Added NY Style Dough.");
    }
}

class CookieDough extends Dough{
    CookieDough(){
        super.price = 5.00;
    }
    public void write(){
        System.out.println("Added Cookie Dough.");
    }
}

class GlutenFreeDough extends Dough{
    GlutenFreeDough(){
        super.price = 5.00;
    }
    public void write(){
        System.out.println("Added Glutten Free Dough.");
    }
}
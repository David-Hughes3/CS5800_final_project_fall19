package part4;

public abstract class Topping{
    protected double price;

    abstract void write();
    public double getPrice(){
        return this.price;
    }
}

class Pepperoni extends Topping{
    Pepperoni(){
        this.price = 3.00;
    }
    public void write(){
        System.out.print("Pepperoni topping. ");
    }
}

class Sausage extends Topping{
    Sausage(){
        this.price = 4.00;
    }
    public void write(){
        System.out.print("Sausage topping. ");
    }
}

class IceCream extends Topping{
    IceCream(){
        super.price = 5.00;
    }
    public void write(){
        System.out.print("Ice Cream topping. ");
    }
}

class Cherry extends Topping{
    Cherry(){
        super.price = 1.00;
    }
    public void write(){
        System.out.print("Cherry topping. ");
    }
}

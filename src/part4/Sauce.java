package part4;

public abstract class Sauce{
    protected double price;

    abstract void write();
    public double getPrice(){
        return this.price;
    }
}

class TomatoSauce extends Sauce{

    TomatoSauce(){
        super.price = 2.00;
    }
    public void write(){
        System.out.println("Added Classic Tomato Sauce.");
    }
}

class ChocolateSauce extends Sauce{

    ChocolateSauce(){
        super.price = 3.00;
    }
    public void write(){
        System.out.println("Added Chocolate Sauce.");
    }
}

class PestoSauce extends Sauce{

    PestoSauce(){
        super.price = 4.00;
    }
    public void write(){
        System.out.println("Added Pesto Sauce.");
    }
}

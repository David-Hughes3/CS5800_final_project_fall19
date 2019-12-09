package part4;


//Decorator for Topping
public class SplitTopping extends Topping{

    Topping wrappee;
    String side;
    public enum Halves {
        LEFT, RIGHT;
    }

    SplitTopping(Topping wrappee, Halves whichHalf){
        this.wrappee = wrappee;
        if(whichHalf == Halves.RIGHT)
            side = "Right half with ";
        if(whichHalf == Halves.LEFT)
            side = "Left half with ";
    }

    public void write(){
        System.out.print(side);
        wrappee.write();
    }

    @Override
    public double getPrice(){
        return wrappee.getPrice() / 2;
    }

}
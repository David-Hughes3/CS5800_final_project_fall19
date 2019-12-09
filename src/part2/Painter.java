package part2;

public class Painter extends Employee{
    @Override
    protected void write(String message){
        System.out.println(message + "car complete");
    }
    public Painter(){
        authorityLevel = Employee.PAINTER;
    }
}
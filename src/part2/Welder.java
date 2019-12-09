package part2;

public class Welder extends Employee{
    @Override
    protected void write(String message){
        System.out.println(message + "all parts have been welded together");
    }
    public Welder(){
        authorityLevel = Employee.WELDER;
    }
}
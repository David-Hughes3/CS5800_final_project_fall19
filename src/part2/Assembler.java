package part2;

public class Assembler extends Employee{
    @Override
    protected void write(String message){
        System.out.println(message + "all parts have been put together");
    }
    public Assembler(){
        authorityLevel = Employee.ASSEMBLER;
    }
}
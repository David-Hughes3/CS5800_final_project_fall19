package part2;

public class PartCollector extends Employee{
    @Override
    protected void write(String message){
        System.out.println(message + "all parts have been gathered");
    }
    public PartCollector(){
        authorityLevel = Employee.PART_COLLECTOR;
    }
}
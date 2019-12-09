package part2;

public class Main {
	public static void main(String[] args) {
        Employee h1 = new PartCollector();
        Employee h2 = new Assembler();
        Employee h3 = new Welder();
        Employee h4 = new Painter();

        h1.setNextEmployee(h2);
        h2.setNextEmployee(h3);
        h3.setNextEmployee(h4);
        h4.setNextEmployee(null);

        h1.doWork(4, "Hey Boss, ");

        h1.doWork(2, "Howdy, ");
    }
}

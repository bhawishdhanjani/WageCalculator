package WageCalculator;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 2);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}

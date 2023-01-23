package WageCalculator;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50000);
        employee.setHourlyRate(200);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}

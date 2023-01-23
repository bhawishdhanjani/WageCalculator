package WageCalculator;

public class Employee {
    private int baseSalary ;
    private int hourlyRate;

    public Employee(int baseSalary , int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

     private void setHourlyRate(int hourlyRate) {
        if(hourlyRate<=0)
            throw new IllegalArgumentException("Hourly rate can not be zero or negative");
        this.hourlyRate = hourlyRate;
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Base salary can not be zero or negative");
        this.baseSalary = baseSalary;
    }

    public int calculateWage(int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }

}

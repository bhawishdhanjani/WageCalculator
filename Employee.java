package WageCalculator;

public class Employee {
    private int baseSalary ;
    private int hourlyRate;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate<=0)
            throw new IllegalArgumentException("Hourly rate can not be zero or negative");
        this.hourlyRate = hourlyRate;
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Base salary can not be zero or negative");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    public int calculateWage(int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }

}

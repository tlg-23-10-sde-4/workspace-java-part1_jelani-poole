package personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public static final double STANDARD_DEDUCTION = 7500.0;

    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    @Override // interface TaxPayer (opt-in)
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }

}
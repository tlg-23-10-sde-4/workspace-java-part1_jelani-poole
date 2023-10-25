package personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields
    private double salary = 2500.0;

    // constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);

        // registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay() {
        double payment = getSalary();
        System.out.println(getName() + " is paid salary " + payment);
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    public void payTaxes() {
        double taxes = getSalary() + TaxPayer.SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "SalariedEmployee: " + "name= " + getName() + " hireDate= " +
//                getHireDate() + " salary= " + getSalary();

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}

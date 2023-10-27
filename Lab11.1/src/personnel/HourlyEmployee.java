package personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    public static final double STANDARD_DEDUCTION = 7500.0;
    // fields
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    @Override
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid hourly " + payment);
    }

    public void payTaxes() {
        double taxes = getRate() * getHours() + TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }



    //accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }



//    @Override
//    public String toString() {
//        return "HourlyEmployee: " + "name= " + getName() + " hireDate= " +
//                getHireDate() + " rate= " + getRate()
//                 + " hours= " + getHours();
//    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hourly=" + getHours();
    }
}
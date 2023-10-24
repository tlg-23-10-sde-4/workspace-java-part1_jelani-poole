package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields
    private double salary;

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

    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " + "name= " + getName() + " hireDate= " +
                getHireDate() + " salary= " + getSalary();
    }
}
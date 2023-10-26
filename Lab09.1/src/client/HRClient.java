/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package client;

import personnel.Department;
import personnel.Executive;
import personnel.HourlyEmployee;
import personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {

        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept); // toString auto called

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1175.0));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1275.0));
        dept.addEmployee(new HourlyEmployee("Fred",  LocalDate.of(2015, 10, 19), 22.0, 30.0));
        dept.addEmployee(new HourlyEmployee("Frannie", LocalDate.of(2022, 9, 10), 25.0, 30.0));
        dept.addEmployee(new Executive("Jay", LocalDate.of(1986, 12, 5), 100_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees:");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break:");
        dept.holidayBreak();
    }
}
package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }
    // BUSINESS METHODS

    /*
     * Option 4: try-catch the exception, then throw a different one.
     * Instead of re-throwing this low-level, transportation-oriented exception,
     * we'll throw a HR-oriented exception more suitable for my HR application client.
     */

    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Honda", "Civic");
        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e); // e is the nested 'cause'
        }
        finally {
            c.stop();
        }
    }

    /*
     * Option 3: try-catch the exception, respond in some way, then re-throw it.
     * We still use finally for the guaranteed call to stop ().
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "Honda", "Civic");
        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            // use JavaMail API to send email to Lisa Herbold to complain
            throw e;
        }
        finally {
            c.stop();
        }
    }

     */

    /*
     * Option 2: ignore the exception ("punt"), I'm not dealing with it.
     * We use a try-finally here, to guarantee that stop() gets called.
     * But since there is no catch, we are still not handling the exception.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC123", "Honda", "Civic");
        try {
            c.start();
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();
        }
    }
     */

    /*
     * Option 1: try-catch and handle. The exception stops here.
     * We use finally to guarantee that stop() gets called.
     */
    /*
    public void goToWork()  {
        Car c = new Car("ABC123", "Honda", "Civic");
        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println(e); // toString auto called (or call e.getMessage())
        }
        finally {
            c.stop();
        }
    }

     */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}
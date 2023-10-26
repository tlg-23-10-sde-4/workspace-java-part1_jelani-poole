package edu.math;
/*
 * An "all-static" class, i.e., one with nothing but static methods
 */

class Calculator {

    // prevent instantiation from outside, this is an "all-static" class
    private Calculator() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 19 (inclusive)
     *
     * HINT: see a class called Math (package java.lang), look for a helpful here.
     * NOTE: the methods in the Math class are all "static," which means you call them as:
     *  Math.methodName()
     */
    public static int randomInt() {
        // delegate to the min-max version, passing 1 for the min, and 19 for the max
        return randomInt(1, 19);
        //        double rand = Math.random();        // 0.00000  to   0.99999
        //        double scaled = (rand * 19) + 1;    // 1.00000  to  18.99999
        //        return (int) scaled;              // explicit downcast from double to int
    }

    /**
     * Returns a random integer between 'min' and 'max' (inclusive)
     *
     * CHALLENGE: implement this.
     */
    public static int randomInt(int min, int max) {
        double rand = Math.random();
        double scaled = rand * (max - min + 1);
        double raised = scaled + min;
        return (int) raised;
    }

    /*
     * returns that average (arithmetic mean) of the supplied integers.
     * getAverage(), or perhaps just average()
     * getAvg()
     * getMean()
     */
    public static double average(int... values) {  //inside here, it is actually an array
        double result = 0.0;

        double sum = 0.0;
        for (int value : values) {
            sum = sum + value;
        }
        result = sum / values.length;
        // iterate over the values
        // add them up
        // divide by length

        return result;
    }

}
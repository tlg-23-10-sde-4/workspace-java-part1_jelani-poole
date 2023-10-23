package edu.math;

import static edu.math.Calculator.*;    // Okay to use * for static imports

class CalculatorClient {

    public static void main(String[] args) {


        double sum = add(3.1, 5.1); // doubles are past where doubles are expected
        System.out.println("The sum is " + sum);

        // below, it's okay to pass ints where doubles are expected in the subtract() method
        // at runtime, an implicit upcast is done, converting the ints to doubles
        System.out.println("The difference is " + subtract(3, 5));

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println("The average is: " + Calculator.average(3, 4, 5, 9, 15));

        System.out.println();

        int min = 5;
        int max = 20;
        boolean itWorks = true;
        int result = 0;

        // iterate 1_000_000 times, calling this method and checking the results against min,max
        for (int i = 0; i < 10_000_000; i++) {
            result = Calculator.randomInt(min, max);  // calls the min-max version

            if (result < min || result > max) {
                itWorks = false;
                break;

            }
        }
        if (itWorks) {
            System.out.println("CONGRATULATIONS, it works!");
        }
        else {
            System.out.println("YOU GOTTA BUG!");
            System.out.println("The value returned is: " + result);
        }

    }
}
package gov.test;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 27;
        ages[1] = 26;
        ages[2] = 10;

        for (int age : ages) {
            System.out.printf("The age is: %s\n", age);
        }
        System.out.printf("This array has %s values\n", ages.length); // length is the number of slots

        System.out.println(Arrays.toString(ages));  // toString() is automatically called, get back hex, unless you use Arrays.toSting
        System.out.println();

        double[] temps = { 63.3, 73, 66.2 };
        System.out.println(Arrays.toString(temps));


    }
}
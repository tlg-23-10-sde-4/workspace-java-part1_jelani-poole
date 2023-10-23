package com.entertainment.client;

import com.entertainment.Television;
import static com.entertainment.DisplayType.*;

/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few
 */
class TelevisionClient {

    // application starting point - at runtime, the app starts here
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        // create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(PLASMA);

        // create a 2nd instance of Television and set its properties
        Television tv2 = new Television("Sony", Television.MAX_VOLUME,OLED);

        // create a 3rd instance
        Television tv3 = new Television("LG");

        // create a 4th instance
        Television tv4 = new Television("Toshiba");

        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();

        tv3.turnOn();
        tv3.turnOff();

        tv4.turnOn();
        tv4.turnOff();

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(tv4);

        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}
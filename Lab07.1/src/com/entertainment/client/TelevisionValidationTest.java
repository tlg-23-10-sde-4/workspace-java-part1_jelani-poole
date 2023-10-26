package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(0);     // should stick
        System.out.println(tv);

        tv.setVolume(100);      // should stick
        System.out.println(tv);

        tv.setVolume(-1);       // error message, volume not set
        tv.setVolume(101);      // error message, volume not set
        System.out.println(tv);     // should still have volume 100


        tv.setBrand("Samsung");     // should stick
        System.out.println(tv);

        tv.setBrand("Sony");        // should stick
        System.out.println(tv);

        tv.setBrand("LG");      // should stick
        System.out.println(tv);

        tv.setBrand("Toshiba");     // should stick
        System.out.println(tv);

        tv.setBrand("INVALID");     // error message, brand not set
        System.out.println(tv);     //should still be Toshiba, from before
    }
}
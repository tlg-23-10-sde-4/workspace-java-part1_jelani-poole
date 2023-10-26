package com.tick;

/*
 * Application main-class, i.e., the class definition with the main() method.
 *
 * Its purpose is to create a few instances of com.tick.AlarmClock and give them a basic test-drive.
 */
class AlarmClockClient {

    public static void main(String[] args){
        // create an instance of com.tick.AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        //create a 2nd instance of com.tick.AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL); // as long as it can
        //clock2.setSnoozeInterval(10); - No longer needed, added constructor to line #14

        // create a 3rd com.tick.AlarmClock object, but don't set its properties - so what will it be?
        AlarmClock clock3 = new AlarmClock();


        // call methods on them
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        // show their toString() methods in action
        System.out.println(clock1);
        System.out.println(clock2);  //toSting() automatically called
        System.out.println(clock3);  //toSting() automatically called
    }
}

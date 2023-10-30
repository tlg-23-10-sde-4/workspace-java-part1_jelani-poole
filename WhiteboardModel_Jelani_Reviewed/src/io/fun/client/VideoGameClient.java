package io.fun.client;

import io.fun.GameType;
import io.fun.VideoGame;

/**
 * JR: very similar to Television labs, but does show a good basic
 * test-drive of a few valid instances.
 */
class VideoGameClient {

    public static void main(String[] args){

        System.out.println(VideoGame.getInstanceCount() + " instances have been created");
        System.out.println();

        VideoGame vg1 = new VideoGame("Xbox", GameType.MINECRAFT, 4);
        vg1.setSystem("Xbox");  // JR: unnecessary, supplied in ctor call above

        VideoGame vg2 = new VideoGame("PlayStation", GameType.GOD_OF_WAR, 1);

        VideoGame vg3 = new VideoGame("PC", GameType.CALL_OF_DUTY, 16);

        vg1.turnOn();
        System.out.println(vg1);
        vg1.turnOff();

        System.out.println();

        vg2.turnOn();
        System.out.println(vg2);
        vg2.turnOff();

        System.out.println();

        vg3.turnOn();
        System.out.println(vg3);
        vg3.turnOff();

        System.out.println(VideoGame.getInstanceCount() + " instances have been created");
    }
}

package io.fun.test;

import io.fun.GameType;
import io.fun.VideoGame;

/**
 * JR: acceptable but not thorough enough.
 * For proper BVT (Boundary Value Testing), for range of values 1-16 on 'players' property,
 * we need to test:
 *  0,1  and  16,17
 */
class VideoGameValidationTest {

    public static void main(String[] args) {
        VideoGame vg = new VideoGame();

        vg.setGame(GameType.GOD_OF_WAR);
        System.out.println("Game: " + vg.getGame());
        vg.setPlayers(4);
        System.out.println("Players: " + vg.getPlayers());

        vg.setPlayers(16);
        System.out.println("Players: " + vg.getPlayers());

        vg.setPlayers(32);
        System.out.println("Players: " + vg.getPlayers());
    }
}
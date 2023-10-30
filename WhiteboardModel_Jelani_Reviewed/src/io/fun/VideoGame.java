package io.fun;

/**
 * JR: Demonstrates basic understanding of program concepts, with a few
 * improvements needed.  ClientArgs is flawed, and ValidationTest is not
 * thorough enough.  More business methods could have been added.
 * Closely modeled after in-class lab work, but was clearly coded independently.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been adequate, but could be improved.
 *
 * Class names, package names, and overall structure are correct.
 */
public class VideoGame {

    public static final int MIN_PLAYERS = 1;
    public static final int MAX_PLAYERS = 16;

    // attributes or properties
    private String system = "Unknown";
    private GameType game;
    private int players = 1;

    // JR: you didn't have to implement this, unless you thought it was interesting
    public static int getInstanceCount() {
        return instanceCount;
    }
    private static int instanceCount = 0;

    // constructor
    public VideoGame() {
        instanceCount++;
    }

    public VideoGame(String system) {
        this();
        setSystem(system);
    }

    public VideoGame(String system, GameType game) {
        this(system);
        setGame(game);
    }

    public VideoGame(String system, GameType game, int players) {
        this(system, game);
        setPlayers(players);
    }

    // accessor methods
    public void turnOn() {
        System.out.println("Turning on your " + getSystem() + ", " + "Loading up your " + getGame() + " game with " + getPlayers() + " players");
    }
    public void turnOff() {
        System.out.println("Thank you for playing, now get some sleep!");
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        if (players >= MIN_PLAYERS && players <= MAX_PLAYERS) {
            this.players = players;
        } else {
            // JR: align these properly............DONE
            System.out.println("The amount of players provided is not supported");
            System.out.println("The supported amount is " + MIN_PLAYERS + "-" + MAX_PLAYERS);
        }
    }

    public GameType getGame() {
        return game;
    }

    public void setGame(GameType game) {
        this.game = game;
    }

    public String toString() {
        return "VideoGame: " +
                "System= " + getSystem() +
                ", Players= " + getPlayers() +
                ", Game= " + getGame();
    }

}

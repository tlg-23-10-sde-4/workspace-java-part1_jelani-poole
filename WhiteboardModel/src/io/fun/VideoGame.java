package io.fun;

public class VideoGame {

    public static final int MIN_PLAYERS = 1;
    public static final int MAX_PLAYERS = 16;

    // attributes or properties
    private String system = "Unknown";
    private GameType game;
    private int players = 1;

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
        }
        else {
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

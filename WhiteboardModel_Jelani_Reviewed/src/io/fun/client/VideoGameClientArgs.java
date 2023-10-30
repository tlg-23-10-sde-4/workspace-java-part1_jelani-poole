package io.fun.client;

import io.fun.GameType;
import io.fun.VideoGame;

/**
 * JR: Several improvements needed.
 *
 * Per 'note2', if user supplies "God of War" for the 'game' input, app crashes with exception.
 *
 * For 'note2' message, use the static values() method available in every enum type,
 * e.g., Arrays.toString(VideoGame.values()), instead of hardcoding them here.
 *
 * There are no constraints on the 'system' property of a VideoGame object,
 * yet you state that "valid systems are Xbox, Playstation, and PC."
 *
 * You could have added support for 'players' as a user input, since VideoGame
 * only has 3 properties, and this would have given you great additional practice.
 */
class VideoGameClientArgs {

    public static void main(String[] args) {

        if (args.length < 2) {
            String usage = "Usage: java VideoGameClientArgs <system> <game>";
            String example = "Example: java VideoGameClientArgs Xbox Minecraft";
            String note1 = "Valid systems are Xbox, Playstation, and PC";
            String note2 = "Supported games are Minecraft, God of War, and Call of Duty";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;
        }

        String system = args[0];
        GameType game = GameType.valueOf(args[1].toUpperCase());

        VideoGame vg = new VideoGame(system, game);
        System.out.println(vg);

        // JR: unnecessary output
        System.out.println("You provided " + args.length + " arguments");
    }
}
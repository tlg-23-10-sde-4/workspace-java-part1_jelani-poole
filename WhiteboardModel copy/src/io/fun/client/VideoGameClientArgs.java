package io.fun.client;

import io.fun.GameType;
import io.fun.VideoGame;

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

        System.out.println("You provided " + args.length + " arguments");
    }
}
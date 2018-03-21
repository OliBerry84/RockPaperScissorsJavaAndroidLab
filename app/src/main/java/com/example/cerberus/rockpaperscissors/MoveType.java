package com.example.cerberus.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cerberus on 21/03/2018.
 */

public enum MoveType {
    ROCK,
    PAPER,
    SCISSORS;

    public static MoveType random() {
        MoveType[] moves = MoveType.values();
        int index = new Random().nextInt(moves.length);
        return moves[index];
    }
}

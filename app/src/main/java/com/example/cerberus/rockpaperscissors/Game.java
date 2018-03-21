package com.example.cerberus.rockpaperscissors;

import java.util.HashMap;

/**
 * Created by cerberus on 21/03/2018.
 */

public class Game {

    private HashMap<MoveType, MoveType> win;
    private MoveType playerMove;
    private MoveType computerMove;

    public Game() {
        win.put(MoveType.ROCK, MoveType.SCISSORS);
        win.put(MoveType.SCISSORS, MoveType.PAPER);
        win.put(MoveType.PAPER, MoveType.ROCK);
    }

    public ResultType play(MoveType playerMove){
        this.playerMove = playerMove;
        computerMove = MoveType.random();
        return findWinner();
    }

    private ResultType findWinner() {
        if (win.get(playerMove) == computerMove) {
            return ResultType.YOUWIN;
        } else if (win.get(computerMove) == playerMove) {
            return ResultType.COMPUTERWINS;
        } else {
            return ResultType.DRAW;
        }
    }

}


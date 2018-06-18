package com.example.markconroy.rock_paper_scissors;

import org.junit.Before;

public class GameTest {

    Game game;
    Selection getComputerChoosesRock = Selection.ROCK;
    Selection getComputerChoosesScissors = Selection.SCISSORS;
    Selection getComputerChoosesPaper = Selection.PAPER;
    Selection getUserChoosesRock = Selection.ROCK;
    Selection getUserChoosesScissors = Selection.SCISSORS;
    Selection getUserChoosesPaper = Selection.PAPER;

    @Before
    public void before() {
        game = new Game();
    }

}

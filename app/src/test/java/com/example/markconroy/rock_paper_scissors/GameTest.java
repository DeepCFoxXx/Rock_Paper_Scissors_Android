package com.example.markconroy.rock_paper_scissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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
    
    @Test
    public void testSelectionType() {
        Selection computerChoice = game.getComputerSelection();
        assertNotNull(computerChoice);
    }

}

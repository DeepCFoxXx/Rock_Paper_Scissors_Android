package com.example.markconroy.rock_paper_scissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;
    Selection computerChoosesRock = Selection.ROCK;
    Selection computerChoosesScissors = Selection.SCISSORS;
    Selection computerChoosesPaper = Selection.PAPER;
    Selection userChoosesRock = Selection.ROCK;
    Selection userChoosesScissors = Selection.SCISSORS;
    Selection userChoosesPaper = Selection.PAPER;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void testSelectionType() {
        Selection computerChoice = game.getComputerSelection();
        assertNotNull(computerChoice);
    }

    @Test
    public void testRockBeatsScissors() {
        Winner winner = game.getWinner(userChoosesRock, computerChoosesScissors);
        assertEquals(Winner.USER, winner);
    }

    @Test
    public void testRockLosestoPaper() {
        Winner winner = game.getWinner(userChoosesRock, computerChoosesPaper);
        assertEquals(winner.ANDROID, winner);
    }

}

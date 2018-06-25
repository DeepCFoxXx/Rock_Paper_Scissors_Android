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

    //Rock
    @Test
    public void testRockBeatsScissors() {
        Winner winner = game.getWinner(userChoosesRock, computerChoosesScissors);
        assertEquals(Winner.USER, winner);
    }

    @Test
    public void testRockLosesToPaper() {
        Winner winner = game.getWinner(userChoosesRock, computerChoosesPaper);
        assertEquals(winner.ANDROID, winner);
    }

    @Test
    public void testRockDrawsRock() {
        Winner winner = game.getWinner(userChoosesRock, computerChoosesRock);
        assertEquals(Winner.DRAW, winner);
    }

    //Paper
    @Test
    public void testPaperBeatsRock() {
        Winner winner = game.getWinner(userChoosesPaper, computerChoosesRock);
        assertEquals(Winner.USER, winner);
    }

    @Test
    public void testPaperLosesToSissors() {
        Winner winner = game.getWinner(userChoosesPaper, computerChoosesScissors);
        assertEquals(Winner.ANDROID, winner);
    }

}

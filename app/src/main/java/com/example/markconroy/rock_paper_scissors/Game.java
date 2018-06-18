package com.example.markconroy.rock_paper_scissors;

import java.util.Random;

public class Game {

    public Selection getComputerSelection() {
        Selection[] options = Selection.values();
        Random rand = new Random();
        int index = rand.nextInt(options.length);
        return options[index];
    }

    public Winner getWinner(Selection userChoice, Selection androidChoice) {

        if (userChoice == androidChoice) {
            return Winner.DRAW;
        }

        switch (userChoice) {
            case ROCK:
                return (androidChoice == Selection.SCISSORS) ? Winner.USER : Winner.ANDROID;
            case PAPER:
                return (androidChoice == Selection.ROCK) ? Winner.USER : Winner.ANDROID;
            case SCISSORS:
                return (androidChoice == Selection.PAPER) ? Winner.USER : Winner.ANDROID;
        }
        return Winner.DRAW;
    }

}

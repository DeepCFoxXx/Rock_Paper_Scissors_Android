package com.example.markconroy.rock_paper_scissors;

import java.util.Random;

public class Game {
    
    public Selection getComputerSelection() {
        Selection[] options = Selection.values();
        Random rand = new Random();
        int index = rand.nextInt(options.length);
        return options[index];
    }

}

package com.example.markconroy.rock_paper_scissors;

public enum Selection {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String value;

    private Selection(String value) {
        this.value = value;
    }

}

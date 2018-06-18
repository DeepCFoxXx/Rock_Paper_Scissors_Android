package com.example.markconroy.rock_paper_scissors;

public enum Winner {

    USER("Player Wins"),
    ANDROID("Android wins"),
    DRAW("Draw!");

    private String value;

    private Winner(String value) {
        this.value = value;
    }

}

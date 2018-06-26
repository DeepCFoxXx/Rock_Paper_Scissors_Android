package com.example.markconroy.rock_paper_scissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game game;
    TextView computerChoiceText;
    TextView userChoiceText;
    TextView resultText;
    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        game = new Game();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computerChoiceText = (TextView)findViewById(R.id.android_choice_text);
        userChoiceText = (TextView)findViewById(R.id.user_choice_text);
        resultText = (TextView)findViewById(R.id.result_text);
        buttonRock = (Button)findViewById(R.id.btnRock);
        buttonPaper = (Button)findViewById(R.id.btnPaper);
        buttonScissors = (Button)findViewById(R.id.btnScissors);
    }

    public void onMakeChoiceButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btnRock:
                Log.d("RockPaperScissors", "Rock selected");
                play(Selection.ROCK);
                break;
            case R.id.btnPaper:
                Log.d("RockPaperScissors", "Paper selected");
                play(Selection.PAPER);
                break;
            case R.id.btnScissors:
                Log.d("RockPaperScissors", "Scissors selected");
                play(Selection.SCISSORS);
                break;
        }
    }

    private void play(Selection user) {

        Selection android = game.getComputerSelection();

        userChoiceText.setText(getString(R.string.userChose)+ user.getValue());
        computerChoiceText.setText(getString(R.string.androidChose) + android.getValue());

        Winner winner = game.getWinner(user, android);

        resultText.setText(winner.getValue());
    }

}

package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreOfA = 0;
    int scoreOfB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    public void displayForTeamA( int scoreOfA) {
        TextView ScoreView = (TextView) findViewById(R.id.team_a_score);
        ScoreView.setText(String.valueOf(scoreOfA));
    }

    public void addThreePointsForA(View view) {
        scoreOfA = scoreOfA + 3;
        displayForTeamA(scoreOfA);
    }

    public void addTwoPointsForA(View view) {
        scoreOfA = scoreOfA + 2;
        displayForTeamA(scoreOfA);
    }

    public void freeThrowPointForA(View view) {
        scoreOfA = scoreOfA + 1;
        displayForTeamA(scoreOfA);
    }


    public void displayForTeamB( int scoreOfB) {
        TextView ScoreView = (TextView) findViewById(R.id.team_b_score);
        ScoreView.setText(String.valueOf(scoreOfB));
    }

    public void addThreePointsForB(View view) {
        scoreOfB = scoreOfB + 3;
        displayForTeamB(scoreOfB);
    }

    public void addTwoPointsForB(View view) {
        scoreOfB = scoreOfB + 2;
        displayForTeamB(scoreOfB);
    }

    public void freeThrowPointForB(View view) {
        scoreOfB = scoreOfB + 1;
        displayForTeamB(scoreOfB);
    }

    public void resetScore(View view) {
        scoreOfA = 0;
        scoreOfB = 0;
        displayForTeamA(scoreOfA);
        displayForTeamB(scoreOfB);
    }
}
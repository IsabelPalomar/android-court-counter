package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView scoreViewTeamA;
    TextView scoreViewTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreViewTeamB = (TextView) findViewById(R.id.team_b_score);

    }

    /**
     * Displays the score value for the team A
     * @param score
     */

    public void displayForTeamA(int score) {
        scoreViewTeamA.setText(String.valueOf(score));
    }

    /**
     * Displays the score for the team A
     * @param score
     */

    public void displayForTeamB(int score) {
        scoreViewTeamB.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point
     */
    public void addOneForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }
    /**
     * Increase the score for Team A by 2 points
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point
     */
    public void addOneForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the score for Team B by 2 pointS
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }
    /**
     * Resets the score for team A and B to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
}

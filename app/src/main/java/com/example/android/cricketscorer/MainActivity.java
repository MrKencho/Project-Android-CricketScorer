package com.example.android.cricketscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_1 = 0;
    int score_2 = 0;
    int wickets_1 = 0;
    int wickets_2 = 0;
    float overs_1 = 0;
    float overs_2 = 0;
    int balls_1 = 0;
    int balls_2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void one_1(View view)
    {
        if(wickets_1<10 && overs_1 < 20.0)
            score_1 += 1;
        scoreForTeam1(score_1);
    }
    public void two_1(View view)
    {
        if(wickets_1<10 && overs_1 < 20.0)
        score_1 += 2;
        scoreForTeam1(score_1);
    }

    public void four_1(View view)
    {
        if(wickets_1<10 && overs_1 < 20.0)
        score_1 += 4;
        scoreForTeam1(score_1);
    }

    public void six_1(View view)
    {
        if(wickets_1<10 && overs_1 < 20.0)
        score_1 += 6;
        scoreForTeam1(score_1);
    }
    public void one_2(View view)
    {
        if(wickets_2<10 && overs_2 < 20.0)
        score_2 += 1;
        scoreForTeam2(score_2);
    }
    public void two_2(View view)
    {
        if(wickets_2<10 && overs_2 < 20.0)
        score_2 += 2;
        scoreForTeam2(score_2);
    }
    public void four_2(View view)
    {
        if(wickets_2<10 && overs_2 < 20.0)
        score_2 += 4;
        scoreForTeam2(score_2);
    }
    public void six_2(View view)
    {
        if(wickets_2<10 && overs_2 < 20.0)
        score_2 += 6;
        scoreForTeam2(score_2);
    }
    public void inc_wickets_1(View view)
    {
        if(wickets_1<10 && overs_1 < 20.0)
        wickets_1++;
        wicketsForTeam1(wickets_1);
    }
    public void inc_wickets_2(View view)
    {
        if(wickets_2<10 && overs_2 < 20.0)
        wickets_2++;
        wicketsForTeam2(wickets_2);
    }
    public void inc_overs_1(View view)
    {
        if(wickets_1 < 10 && overs_1 < 20.0) {
            balls_1++;
            if(balls_1 == 6){
                balls_1 = 0;
                overs_1++;
            }
        }
        float temp = balls_1 / (float)10;
        oversForTeam1(overs_1+temp);
    }
    public void inc_overs_2(View view)
    {
        if(wickets_2 < 10 && overs_2 < 20.0) {
            balls_2++;
            if(balls_2 == 6){
                balls_2 = 0;
                overs_2++;
            }
        }
        float temp = balls_2 / (float)10;
        oversForTeam2(overs_2+temp);
    }
    public void reset(View view)
    {
        score_1=0;
        score_2=0;
        overs_1=0;
        overs_2 = 0;
        wickets_1=0;
        wickets_2=0;
        scoreForTeam1(0);
        scoreForTeam2(0);
        oversForTeam1(0);
        oversForTeam2(0);
        wicketsForTeam1(0);
        wicketsForTeam2(0);
    }
    public void scoreForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_1);
        scoreView.setText(String.valueOf(score));}
    public void scoreForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_2);
        scoreView.setText(String.valueOf(score));}
    public void wicketsForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickets_team_1);
        scoreView.setText(String.valueOf(score));}
    public void wicketsForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickets_team_2);
        scoreView.setText(String.valueOf(score));}
    public void oversForTeam1(float score) {
        TextView scoreView = (TextView) findViewById(R.id.overs_team_1);
        scoreView.setText(String.valueOf(score));}
    public void oversForTeam2(float score) {
        TextView scoreView = (TextView) findViewById(R.id.overs_team_2);
        scoreView.setText(String.valueOf(score));}
}

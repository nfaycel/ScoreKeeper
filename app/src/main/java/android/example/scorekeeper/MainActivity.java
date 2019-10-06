package android.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    int teamARed = 0;
    int teamBRed = 0;
    int teamAYel = 0;
    int teamBYel = 0;
    TextView txtTeamAScore;
    TextView txtTeamBScore;
    TextView txtTeamARed;
    TextView txtTeamBRed;
    TextView txtTeamAYel;
    TextView txtTeamBYel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        txtTeamAScore = findViewById(R.id.textview_teama_score);
        txtTeamBScore = findViewById(R.id.textview_teamb_score);
        txtTeamARed = findViewById(R.id.score_redcard_TA);
        txtTeamBRed = findViewById(R.id.score_redcard_TB);
        txtTeamAYel = findViewById(R.id.score_yellowcard_TA);
        txtTeamBYel = findViewById(R.id.score_yellowcard_TB);
    }

    // reset the score of the two team (gools,red cards, yellow cards)
    public void reset(View view) {
        teamAScore = 0;
        txtTeamAScore.setText(String.valueOf(teamAScore));
        teamBScore = 0;
        txtTeamBScore.setText(String.valueOf(teamBScore));
        teamARed = 0;
        txtTeamARed.setText(String.valueOf(teamARed));
        teamBRed = 0;
        txtTeamBRed.setText(String.valueOf(teamBRed));
        teamAYel = 0;
        txtTeamAYel.setText(String.valueOf(teamAYel));
        teamBYel = 0;
        txtTeamBYel.setText(String.valueOf(teamBYel));
    }
    //add a value of "1" to team A gools
    public void gool_TA(View view) {
        teamAScore += 1;
        txtTeamAScore.setText(String.valueOf(teamAScore));
    }
    //add a value of "1" to team B gools
    public void gool_TB(View view) {
        teamBScore += 1;
        txtTeamBScore.setText(String.valueOf(teamBScore));
    }
    //add a value of "1" to team A red cards
    public void redcard_TA(View view) {
        teamARed += 1;
        txtTeamARed.setText(String.valueOf(teamARed));
    }
    //add a value of "1" to team B red cards
    public void redcard_TB(View view) {
        teamBRed += 1;
        txtTeamBRed.setText(String.valueOf(teamBRed));
    }
    //add a value of "1" to team A yellow cards
    public void yelcard_TA(View view) {
        teamAYel += 1;
        txtTeamAYel.setText(String.valueOf(teamAYel));
    }
    //add a value of "1" to team B yellow cards
    public void yelcard_TB(View view) {
        teamBYel += 1;
        txtTeamBYel.setText(String.valueOf(teamBYel));
    }
}

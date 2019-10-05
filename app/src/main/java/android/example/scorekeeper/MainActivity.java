package android.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamBscore = 0;
    int teamAred = 0;
    int teamBred = 0;
    int teamAyel = 0;
    int teamByel = 0;

    TextView txtteamAscore, txtteamBscore, txtteam_A_red, txtteam_B_red, txtteam_A_yel, txtteam_B_yel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

        txtteamAscore = findViewById(R.id.textview_teama_score);
        txtteamBscore = findViewById(R.id.textview_teamb_score);
        txtteam_A_red = findViewById(R.id.score_redcard_TA);
        txtteam_B_red = findViewById(R.id.score_redcard_TB);
        txtteam_A_yel = findViewById(R.id.score_yellowcard_TA);
        txtteam_B_yel = findViewById(R.id.score_yellowcard_TB);
    }


    public void reset(View view) {
        teamAscore = 0;
        txtteamAscore.setText(String.valueOf(teamAscore));
        teamBscore = 0;
        txtteamBscore.setText(String.valueOf(teamBscore));

        teamAred = 0;
        txtteam_A_red.setText(String.valueOf(teamAred));
        teamBred = 0;
        txtteam_B_red.setText(String.valueOf(teamBred));

        teamAyel = 0;
        txtteam_A_yel.setText(String.valueOf(teamAyel));
        teamByel = 0;
        txtteam_B_yel.setText(String.valueOf(teamByel));
    }

    public void gool_TA(View view) {
        teamAscore += 1;
        txtteamAscore.setText(String.valueOf(teamAscore));
    }

    public void gool_TB(View view) {
        teamBscore += 1;
        txtteamBscore.setText(String.valueOf(teamBscore));
    }

    public void redcard_TA(View view) {
        teamAred +=1;
        txtteam_A_red.setText(String.valueOf(teamAred));

    }
    public void redcard_TB(View view) {
        teamBred +=1;
        txtteam_B_red.setText(String.valueOf(teamBred));
    }

    public void yelcard_TA(View view) {
        teamAyel +=1;
        txtteam_A_yel.setText(String.valueOf(teamAyel));

    }
    public void yelcard_TB(View view) {
        teamByel +=1;
        txtteam_B_yel.setText(String.valueOf(teamByel));
    }
}

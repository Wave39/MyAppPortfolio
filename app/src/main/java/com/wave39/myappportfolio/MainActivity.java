package com.wave39.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void appButtonClick(View view) {
        int viewId = view.getId();
        String textString = "This button will launch the ";
        if (viewId == R.id.spotify_streamer_button) {
            textString += "Spotify streamer";
        }
        else if (viewId == R.id.football_scores_app) {
            textString += "football scores";
        }
        else if (viewId == R.id.library_app_button) {
            textString += "library";
        }
        else if (viewId == R.id.build_it_bigger_button) {
            textString += "build it bigger";
        }
        else if (viewId == R.id.xyz_reader_button) {
            textString += "XYZ reader";
        }
        else if (viewId == R.id.capstone_button) {
            textString += "capstone";
        }

        textString += " app!";

        Toast.makeText(getApplicationContext(), textString, Toast.LENGTH_SHORT).show();
    }
}

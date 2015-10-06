package com.wave39.myappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void appButtonClick(View view) {
        int viewId = view.getId();

        // launch an intent for the selected button view ID
        if (viewId == R.id.popular_movies_button) {
            Intent i = getPackageManager().getLaunchIntentForPackage("com.wave39.popularmoviesstage2");
            startActivity(i);
            return;
        }
        else if (viewId == R.id.library_app_button) {
            Intent i = getPackageManager().getLaunchIntentForPackage("it.jaschke.alexandria");
            startActivity(i);
            return;
        }
        else if (viewId == R.id.football_scores_app) {
            Intent i = getPackageManager().getLaunchIntentForPackage("barqsoft.footballscores");
            startActivity(i);
            return;
        }

        String textString = "This button will launch the ";
        if (viewId == R.id.build_it_bigger_button) {
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

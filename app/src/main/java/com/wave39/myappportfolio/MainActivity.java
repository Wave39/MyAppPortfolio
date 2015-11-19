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

    void launchPackage(String packageString) {
        Intent i = getPackageManager().getLaunchIntentForPackage(packageString);
        startActivity(i);
    }

    public void appButtonClick(View view) {
        int viewId = view.getId();

        // launch an intent for the selected button view ID
        if (viewId == R.id.popular_movies_button) {
            launchPackage("com.wave39.popularmoviesstage2");
            return;
        }
        else if (viewId == R.id.library_app_button) {
            launchPackage("it.jaschke.alexandria");
            return;
        }
        else if (viewId == R.id.football_scores_app) {
            launchPackage("barqsoft.footballscores");
            return;
        }
        else if (viewId == R.id.build_it_bigger_button) {
            launchPackage("com.udacity.gradle.builditbigger");
            return;
        }

        String textString = "This button will launch the ";
        if (viewId == R.id.xyz_reader_button) {
            textString += "XYZ reader";
        }
        else if (viewId == R.id.capstone_button) {
            textString += "capstone";
        }

        textString += " app!";

        Toast.makeText(getApplicationContext(), textString, Toast.LENGTH_SHORT).show();
    }
}

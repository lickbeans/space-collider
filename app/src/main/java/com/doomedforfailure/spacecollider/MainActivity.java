package com.doomedforfailure.spacecollider;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the orientation of the screen to Landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //Getting the Play Button to Work
        buttonPlay = (ImageButton) findViewById(R.id.ButtonPlay);

        buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, GameActivity.class));
    }
}

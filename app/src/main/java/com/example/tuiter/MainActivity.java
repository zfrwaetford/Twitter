package com.example.tuiter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.BounceInterpolator;

import mx.jesusmartinoza.widget.SweetPassword;

public class MainActivity extends AppCompatActivity {

    private SweetPassword sweetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sweetPassword = findViewById(R.id.sweetpassword);
        sweetPassword.setInterpolator(new BounceInterpolator());
        sweetPassword.setAnimDuration(400);
    }
}

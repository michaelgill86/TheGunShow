package com.zybooks.thegunshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rowan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rowan_activity);
        Button newActivity3 = (Button) findViewById(R.id.button5);
        newActivity3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Rowan.this, rocoGK.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity = (Button) findViewById(R.id.button1);
        newActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Rowan.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


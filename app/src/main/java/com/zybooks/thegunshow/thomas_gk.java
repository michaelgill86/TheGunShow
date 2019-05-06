package com.zybooks.thegunshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class thomas_gk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thomas_gk);

        Button newActivity = (Button) findViewById(R.id.button8);
        newActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(thomas_gk.this, Davidson.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity2 = (Button) findViewById(R.id.button9);
        newActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(thomas_gk.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    }

package com.zybooks.thegunshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dixie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dixie);


        Button newActivity = (Button) findViewById(R.id.button13);
        newActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Dixie.this, mecklenburg.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity2 = (Button) findViewById(R.id.button14);
        newActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Dixie.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}



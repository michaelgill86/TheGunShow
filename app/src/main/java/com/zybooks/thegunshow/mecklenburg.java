package com.zybooks.thegunshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class mecklenburg extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecklenburg);

        Button newActivity = (Button) findViewById(R.id.button11);
        newActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(mecklenburg.this, Dixie.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity2 = (Button) findViewById(R.id.button12);
        newActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(mecklenburg.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


package com.zybooks.thegunshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Davidson extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.davidson);

        Button newActivity = (Button) findViewById(R.id.button6);
        newActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Davidson.this, thomas_gk.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity2 = (Button) findViewById(R.id.button7);
        newActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Davidson.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}




package com.zybooks.thegunshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newActivity = (Button) findViewById(R.id.button3);
        newActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Rowan.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity2 = (Button) findViewById(R.id.button4);
        newActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Davidson.class);
                startActivity(intent);
                finish();
            }
        });
        Button newActivity3 = (Button) findViewById(R.id.button10);
        newActivity3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mecklenburg.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

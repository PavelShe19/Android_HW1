package com.example.Android_HW1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity_gal extends AppCompatActivity {

    Button btn;
    int counter = 0;

    ImageButton left;
    ImageButton right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gal);

        btn = (Button)findViewById(R.id.button1);

        left = (ImageButton) findViewById(R.id.prev_btn);
        right = (ImageButton) findViewById(R.id.next_btn);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_gal.this, MainActivity_oshrit.class));
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_gal.this, MainActivity_yotam.class));
            }
        });

    }

    public void CountClick(View v)
    {
        counter++;
        btn.setText("Likes number:" + String.valueOf(counter));
    }
}

package com.example.Android_HW1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity_yotam extends AppCompatActivity {

    Button btn;
    ImageButton left;
    ImageButton right;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_yotam);

        btn = (Button)findViewById(R.id.likeBtn);
        left = (ImageButton) findViewById(R.id.prev_btn);
        right = (ImageButton) findViewById(R.id.next_btn);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_yotam.this, MainActivity_gal.class));
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_yotam.this, MainActivity_pavel.class));
            }
        });


    }

    public void CountClick(View v)
    {
        counter++;
        btn.setText("Likes number:" + String.valueOf(counter));
    }
}

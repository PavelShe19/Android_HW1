package com.example.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity_pavel extends AppCompatActivity {

    TextView likes;
    Button btn;
    int _likes;
    ImageButton left;
    ImageButton right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pavel);

        likes = findViewById(R.id.Counter1);
        btn = (Button)findViewById(R.id.button_id1);
        _likes = 0;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likes.setText(++_likes);
            }
        });

        left = (ImageButton) findViewById(R.id.prev_btn);
        right = (ImageButton) findViewById(R.id.next_btn);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_pavel.this, MainActivity_yotam.class));
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_pavel.this, MainActivity_gal.class));
            }
        });
    }


}

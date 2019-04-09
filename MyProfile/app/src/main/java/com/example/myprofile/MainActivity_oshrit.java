package com.example.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity_oshrit extends AppCompatActivity {

    static  int likecount =0;
    ImageButton left;
    ImageButton right;

    public void likeClick (View view){
        TextView likeCnt =(TextView)findViewById(R.id.likeCnt);
        likecount++;
        likeCnt.setText(String.valueOf(likecount));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oshrit);

        left = (ImageButton) findViewById(R.id.prev_btn);
        right = (ImageButton) findViewById(R.id.next_btn);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_oshrit.this, MainActivity_matan.class));
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_oshrit.this, MainActivity_gal.class));
            }
        });
    }
}

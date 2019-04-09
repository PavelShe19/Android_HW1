package com.example.Android_HW1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.util.Log;

public class MainActivity_matan extends AppCompatActivity {

    static int likeCounter =0;
    ImageButton left;
    ImageButton right;

    public void likeFunc(View v)
    {
        likeCounter++;
        Log.i("info",String.valueOf(likeCounter));
        TextView edt = (TextView) findViewById(R.id.likeTextView);
        String a = String.valueOf(likeCounter);
        edt.setText(a);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_matan);

        left = (ImageButton) findViewById(R.id.prev_btn);
        right = (ImageButton) findViewById(R.id.next_btn);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_matan.this, MainActivity_pavel.class));
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity_matan.this, MainActivity_oshrit.class));
            }
        });
    }





}

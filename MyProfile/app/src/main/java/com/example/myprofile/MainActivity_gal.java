package com.example.myprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_gal extends AppCompatActivity {

    Button btn;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gal);

        btn = (Button)findViewById(R.id.button1);

    }

    public void CountClick(View v)
    {
        counter++;
        btn.setText("Likes number:" + String.valueOf(counter));
    }
}

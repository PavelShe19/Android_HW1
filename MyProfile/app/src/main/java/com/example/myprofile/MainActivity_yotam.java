package com.example.yotamhw1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static  int likecount =0;



    public void likeClick (View view){
        TextView likeCnt =(TextView)findViewById(R.id.likeCnt);
        likecount++;
        likeCnt.setText(String.valueOf(likecount));


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

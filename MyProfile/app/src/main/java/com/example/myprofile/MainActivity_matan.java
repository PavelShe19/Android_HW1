package com.example.matanhw1android;
package com.example.myprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
public class MainActivity_matan extends AppCompatActivity {

    static int likeCounter =0;


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
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main_matan);
    }





}

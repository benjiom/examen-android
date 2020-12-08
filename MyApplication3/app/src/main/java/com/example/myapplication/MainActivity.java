package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    public void goToActivity2(View view){

        Log.e("DEVE0304", "MainActivity.goToActivity2()");
    };


    public void doSomePrinting(View view) {

        Log.e("DEVE0304", "MainActivity:doSomePrinting()");

        String [] list_of_languages = {"Java", "Python", "Php", "Ruby on Rail", "C++"};

        for (int idx = 0 ; idx <= list_of_languages.length ; idx ++)
            Log.e("DEVE0304", "" + idx + " : " + list_of_languages[idx]);

    }
}
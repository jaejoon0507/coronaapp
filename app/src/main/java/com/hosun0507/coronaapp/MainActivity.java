package com.hosun0507.coronaapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hosun0507.coronaapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
    char a = '\n';
    public void button1 (View view){

        activityMainBinding.textView.setText("하이");
        activityMainBinding.textView.append(""+a);
        activityMainBinding.textView.append("하이");
    }
}
package com.example.tuantai.udemy_services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void startService(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }

    public void next(View view) {
    }
}

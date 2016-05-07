package com.example.tuantai.udemy_services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        Intent intent = new Intent(this, SimpleService.class);
        intent.putExtra("message", "this is from main activity");
        startService(intent);

    }

    public void stopService(View view) {
        Intent intent = new Intent(this, SimpleService.class);
        stopService(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

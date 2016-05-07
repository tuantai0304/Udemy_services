package com.example.tuantai.udemy_services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    EditText ed1, ed2;
    BindedService bindedService;
    boolean status;

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            BindedService.LocalBinder binder = (BindedService.LocalBinder) service;
            bindedService = binder.getService();
            status = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ed1 = (EditText) findViewById(R.id.editText_1);
        ed2 = (EditText) findViewById(R.id.editText2);
    }

    public void add(View view) {
        if (status) {
            int num1 = Integer.parseInt(ed1.getText().toString());
            int num2 = Integer.parseInt(ed2.getText().toString());
            int res = bindedService.add(num1, num2);
            Toast.makeText(ThirdActivity.this, "Res = " + res, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(ThirdActivity.this, "Bind the service first", Toast.LENGTH_SHORT).show();
        }
    }

    public void unbindService(View view) {
        if (status) {
            unbindService(conn);
            Toast.makeText(ThirdActivity.this, "Unbinded success", Toast.LENGTH_SHORT).show();
            status = false;
        } else {
            Toast.makeText(ThirdActivity.this, "Service already unbincde", Toast.LENGTH_SHORT).show();
        }

    }

    public void bindService(View view) {
        Intent intent = new Intent(this, BindedService.class);
        bindService(intent, conn, Context.BIND_AUTO_CREATE);
        status = true;
        Toast.makeText(ThirdActivity.this, "Binded succesfull", Toast.LENGTH_SHORT).show();
    }
}

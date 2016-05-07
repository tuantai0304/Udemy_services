package com.example.tuantai.udemy_services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by TuanTai on 6/05/2016.
 */
public class SimpleService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(SimpleService.this, "Service created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(SimpleService.this, "Service started", Toast.LENGTH_SHORT).show();

        String str = intent.getStringExtra("message");
        Toast.makeText(SimpleService.this, str, Toast.LENGTH_SHORT).show();

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(SimpleService.this, "Service stoped", Toast.LENGTH_SHORT).show();
    }
}

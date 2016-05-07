package com.example.tuantai.udemy_services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class BindedService extends Service {

    private final IBinder mBinder = new LocalBinder();

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }

    public class LocalBinder extends Binder {
        public BindedService getService() {
            return BindedService.this;
        }
    }

    public int add(int x, int y) {
        return x+y;
    }
}

package com.example.tuantai.udemy_services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by TuanTai on 6/05/2016.
 */
public class MyIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService() {
        super("My intent service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Toast.makeText(MyIntentService.this, "On handle message", Toast.LENGTH_SHORT).show();
        Log.d("Intentservice", "Display a message");
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(MyIntentService.this, "Service created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyIntentService.this, "Service stopped", Toast.LENGTH_SHORT).show();
    }
}

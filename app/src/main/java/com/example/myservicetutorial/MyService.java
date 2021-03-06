package com.example.myservicetutorial;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;


import androidx.annotation.Nullable;
public class MyService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(),"START SERVICE",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(),"STOP SERVICE",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}

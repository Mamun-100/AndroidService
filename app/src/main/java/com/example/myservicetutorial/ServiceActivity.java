package com.example.myservicetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }
    public void startService(View view){
        startService(new Intent(this,MyService.class));

    }

    public void stopService(View view){
        stopService(new Intent(this,MyService.class));
    }
}
package com.example.AndroidActivityLifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        Log.e("OnCreate:","=> OnCreate Started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("OnStart:","=> onStart Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("OnResume:","=> OnResume Started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("OnPause:","=> OnPause Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("OnStop:","=> OnStop Started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("OnRestart:","=> OnRestart Started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("OnDestroy", "=> OnDestroy Started");
    }
}
package com.tencent.shadow.sample.plugin;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Test", "MainActivity" + getIntent().getExtras());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
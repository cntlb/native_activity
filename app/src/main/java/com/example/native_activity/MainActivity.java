package com.example.native_activity;

import android.app.NativeActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends NativeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("launch MainActivity success!");
    }
}

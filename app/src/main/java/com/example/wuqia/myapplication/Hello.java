package com.example.wuqia.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wuqia on 2017/1/7.
 */

public class Hello extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        if(getIntent()!=null) {
            String str = getIntent().getStringExtra("USERNAME");

        }
    }
}

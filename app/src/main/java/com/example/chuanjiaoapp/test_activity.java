package com.example.chuanjiaoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class test_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //显示上方导航页面的 <-

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        /*
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         */
    }


}

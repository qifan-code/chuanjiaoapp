package com.example.chuanjiaoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class test_activity extends AppCompatActivity {

    Button sales_button;
    protected void onCreate(Bundle savedInstanceState) {
        //显示上方导航页面的 <-

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        sales_button = (Button)findViewById(R.id.kefu);
        sales_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test_activity.this, SalesActivity.class);
                startActivity(intent);
            }
        });
        /*
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         */
    }


}

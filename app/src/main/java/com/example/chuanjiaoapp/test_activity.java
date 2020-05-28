package com.example.chuanjiaoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.button.MaterialButton;

public class test_activity extends AppCompatActivity {

    Button sales_button;
    Button add_new_project_button;
    Button check_project_detail;
    Button new_project_material_apply;
    Button material_return;
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
        add_new_project_button = (Button) findViewById(R.id.new_project_button);
        add_new_project_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (test_activity.this, addnew_project.class);
                startActivity(intent);
            }
        });
        check_project_detail = (Button) findViewById(R.id.gongdanxiangqing);
        check_project_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test_activity.this, ProjectDetailActivity.class);
                startActivity(intent);
            }
        });
        new_project_material_apply = (Button) findViewById(R.id.new_project_material_apply);
        new_project_material_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(test_activity.this, NewProjectMaterialApplyActivity.class);
                startActivity(intent);
            }
        });
        material_return = (Button) findViewById(R.id.material_return);
        material_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (test_activity.this, MaterialReturnActivity.class);
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

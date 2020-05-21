package com.example.chuanjiaoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button login_button_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //switch to test_activity
        login_button_activity = (Button)findViewById(R.id.login_button);
        login_button_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, test_activity.class);
                startActivity(intent);
            }
        });
        //switch to forget_password_activity
        TextView forget_password = (TextView)findViewById(R.id.forget_password);
        forget_password.setText(getClickableSpan());
        forget_password.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private SpannableString getClickableSpan(){
        SpannableString spanStr = new SpannableString("忘记密码");
        spanStr.setSpan(new UnderlineSpan(), 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(MainActivity.this, forget_password.class));
            }
        }, 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new ForegroundColorSpan(Color.rgb(103,135,193)), 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spanStr;
    }

}

package com.tanmay.activitytoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView, textView_two, textView_three;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView = findViewById(R.id.textView);
        textView_two = findViewById(R.id.textView2);
        textView_three = findViewById(R.id.textView3);

        Intent i = getIntent();
        String username = i.getStringExtra("name");
        String email_add = i.getStringExtra("email");
        int contact_num = i.getIntExtra("number", 0);

        textView.setText("Your Name is :" + username);
        textView_two.setText("Your Email Address is :" + email_add);
        textView_three.setText("Your Contact Number is :" + contact_num);

    }
}

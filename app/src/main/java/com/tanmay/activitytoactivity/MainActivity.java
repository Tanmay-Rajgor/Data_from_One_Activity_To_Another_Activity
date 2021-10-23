package com.tanmay.activitytoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, email, contact;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName3);
        email = findViewById(R.id.editTextTextEmailAddress3);
        contact = findViewById(R.id.editTextPhone2);
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String email_add = email.getText().toString();
                int contact_num = Integer.parseInt(contact.getText().toString());


                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("name",username);
                i.putExtra("email", email_add);
                i.putExtra("number", contact_num);
                startActivity(i);
            }
        });

    }
}
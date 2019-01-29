package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public EditText firstName;
    public EditText lastName;
    public Button startBtn;

    ArrayList<String> Users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        startBtn = findViewById(R.id.start_btn);


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String first = firstName.getText().toString();
                String last = lastName.getText().toString();

                if (TextUtils.isEmpty(first)){
                    Toast.makeText(MainActivity.this, "No first name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(last)){
                    Toast.makeText(MainActivity.this, "No last name", Toast.LENGTH_SHORT).show();
                    return;
                }

                String NewUser = first + last;
                Users.add(NewUser);

                startActivity(new Intent(getApplicationContext(), QuizActivity.class));




            }
        });


    }
}

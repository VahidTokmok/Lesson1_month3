package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    TextView textName, textSurname, textAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        textName = findViewById(R.id.text_name);
        textSurname = findViewById(R.id.text_surname);
        textAge = findViewById(R.id.text_age);

        textName.setText(getIntent().getStringExtra("nameKey"));
        textSurname.setText(getIntent().getStringExtra("surnameKey"));
        textAge.setText(getIntent().getStringExtra("ageKey"));

    }
}
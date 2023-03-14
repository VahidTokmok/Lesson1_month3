package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText surnameText;
    EditText ageText;
    AppCompatButton goButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.editText_name);
        surnameText = findViewById(R.id.editText_surname);
        ageText = findViewById(R.id.editText_age);
        goButton = findViewById(R.id.bottom_to_next);

        goButton.setOnClickListener(v -> {
            String name, surname, age;
            name = nameText.getText().toString();
            surname = surnameText.getText().toString();
            age = ageText.getText().toString();

            Intent intent = new Intent(MainActivity.this, NameActivity.class);
            intent.putExtra("nameKey", name);
            intent.putExtra("surnameKey", surname);
            intent.putExtra("ageKey", age);
            startActivity(intent);
        });

    }

}
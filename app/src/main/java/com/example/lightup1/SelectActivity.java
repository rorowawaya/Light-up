package com.example.lightup1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    Button button1;
    Button button2;

    Button button3;

    Button button4;

    Button button5;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        button1 = findViewById(R.id.btnnext);
        button2 = findViewById(R.id.goBtn);
        button3 = findViewById(R.id.goBtn1);
        button4 = findViewById(R.id.goBtn2);
        button5 = findViewById(R.id.goBtn3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, select2.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, book.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, book2.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, book3.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(view -> {
            Intent intent = new Intent(SelectActivity.this, book4.class);
            startActivity(intent);

        });

    }

    }




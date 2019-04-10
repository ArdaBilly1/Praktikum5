package com.example.hanif.praktikum5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLuas, btnBrowser, btnKalkulator, btnRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLuas = findViewById(R.id.btnluas);
        btnBrowser = findViewById(R.id.btnBrowser);
        btnKalkulator = findViewById(R.id.btnKalkulator);
        btnRecycle = findViewById(R.id.btnRecycler);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Luas.class);
                startActivity(i);
            }
        });

        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Browser.class);
                startActivity(i);
            }

        });

        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Kalkulator.class);
                startActivity(i);

            }
        });

        btnRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MakananActivity.class);
                startActivity(i);

            }
        });

    }
}
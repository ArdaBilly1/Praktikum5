package com.example.hanif.praktikum5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Luas extends AppCompatActivity {

    private EditText editpanjang,editebar;
    private TextView textView;
    private Button buttonhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        editpanjang = findViewById(R.id.editpanjang);
        editebar = findViewById(R.id.editlebar);
        textView = findViewById(R.id.textview);
        buttonhitung = findViewById(R.id.buttonhitung);

        buttonhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float panjang = Float.parseFloat(editpanjang.getText().toString());
                Float lebar = Float.parseFloat(editebar.getText().toString());
                Float luas = panjang * lebar;

                textView.setText(luas.toString());
            }
        });
    }
}


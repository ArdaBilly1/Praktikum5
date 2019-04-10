package com.example.hanif.praktikum5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Browser extends AppCompatActivity {

    private Button buttonbrowser;
    private EditText editurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        buttonbrowser = findViewById(R.id.buttonbrowser);
        editurl = findViewById(R.id.editurl);

        buttonbrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editurl.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);


            }
        });
    }
}

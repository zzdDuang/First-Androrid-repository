package com.example.application_06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


 TextView t1;
 TextView t2;
 Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = findViewById(R.id.txt_01);
        t2 = findViewById(R.id.txt_02);
        b1 = findViewById(R.id.button_01);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(R.string.app_name);
            }
        });







    }
}
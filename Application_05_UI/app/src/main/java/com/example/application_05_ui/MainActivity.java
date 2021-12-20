package com.example.application_05_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // TODO UI控件成员变量定义
     TextView textView_01 ;
     Button button_01;
     Button button_02;
    Button button_03;
    Switch aSwitch ;
    ProgressBar progressBar_01;
    ProgressBar progressBar_02_horizontal;
    ProgressBar progressBar_03_horizontal;
    EditText editText ;
    ImageView myImageView;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO 建立MainActivity与activity_main.xml之间的UI联系
        setContentView(R.layout.activity_main);

        textView_01 = findViewById(R.id.textView_01);

        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);
        button_03 = findViewById(R.id.button_03_confirm);

        aSwitch = findViewById(R.id.switch1);

        editText = findViewById(R.id.editTextNumber_01);
        myImageView = findViewById(R.id.imageView_001);

        progressBar_01 = findViewById(R.id.progressBar_01);
        progressBar_02_horizontal = findViewById(R.id.progressBar_02_horizontal);
        progressBar_03_horizontal = findViewById(R.id.progressBar_03_horizontal);


        radioGroup = findViewById(R.id.radioGroup);

// TODO     onClick方法的重写
        button_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_01.setText(R.string.button_01);
            }
        });
        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_01.setText(R.string.button_02_msg);
            }
        });
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    textView_01.setText("Okay,let's pick");
                }
            }
        });


        button_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNumber =  editText.getText().toString();
                if(TextUtils.isEmpty(inputNumber)){
                    inputNumber = "0";
                }
                progressBar_03_horizontal.setProgress(Integer.valueOf(inputNumber));
            }




        });



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Random randomNumber = new Random();
                checkedId = randomNumber.nextInt(5);
                switch (checkedId){
                    case 0:
                        myImageView.setImageResource(R.drawable.potter);
                        textView_01.setText("Magic! You picked Harry Potter! ");
                        break;
                    case 1:
                        myImageView.setImageResource(R.drawable.granger);
                        textView_01.setText("OMG You picked Hermione Granger! ");
                        break;
                    case 2:
                        myImageView.setImageResource(R.drawable.malfoy);
                        textView_01.setText("Oh,it's Draco Malfoy !");
                        break;
                    case 3:

                        myImageView.setImageResource(R.drawable.ron);
                        textView_01.setText("Wow,You picked nice boy: Ron Weasley! ");
                        break;
                    case 4:
                        myImageView.setImageResource(R.drawable.voldemort);
                        textView_01.setText("A devil..You picked the Lord Voldemort...");
                        break;


                }

            }
        });


    }
}
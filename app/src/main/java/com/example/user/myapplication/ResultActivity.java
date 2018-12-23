package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        float bmi = getIntent().getFloatExtra("BMI" , 0);
        TextView result = findViewById(R.id.bmiresult);
        result.setText("Your BMI is " + bmi);


    }
}

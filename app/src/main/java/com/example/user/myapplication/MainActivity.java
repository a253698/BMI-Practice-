package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edweight;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bmi(View view){
        findView();
        float weight = Float.parseFloat(edweight.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        float bmi = weight / (height * height);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI" , bmi);
        startActivity(intent);
    }

    private void findView() {
        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);

    }
}

package com.example.user.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edweight;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);
    }

    public void bmi(View view){
        float weight = Float.parseFloat(edweight.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        float bmi = weight / height * height ;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI" , bmi);
        startActivity(intent);
    }
}

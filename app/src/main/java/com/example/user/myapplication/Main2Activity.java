package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText edweight;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void bmi(View view){
        findView();
        float w = Float.parseFloat(edweight.getText().toString());
        float h = Float.parseFloat(edheight.getText().toString());
        float bmi = w / (h * h);
        Intent intent = new Intent(this.ResultActivity.class);
        intent.putExtra("Bmi", bmi);
        startActivities(intent);

    }

    private void findView() {
        edweight = findViewById(R.id.edweight);
        edheight = findViewById(R.id.edheight);
    }
}

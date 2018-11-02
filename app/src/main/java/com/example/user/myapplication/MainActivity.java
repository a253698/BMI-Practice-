package com.example.user.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bmi(View view){
        Log.d("MainActivity" , "bmi");
        final EditText edWeight = findViewById(R.id.ed_weight);
        final EditText edHeight = findViewById(R.id.ed_height);
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        Log.d("MainActivity", w +"/" +h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height + height );
        Log.d("MainActivity", bmi + "");

//        Toast.makeText(this, "Your BMI is " + bmi, Toast.LENGTH_LONG).show();

        new AlertDialog.Builder(this).setMessage("Your Bmi is " + bmi)
                .setTitle("BMI").setPositiveButton("OK",null).setNegativeButton("Clear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                edHeight.setText(" ");
                edWeight.setText( " ");
            }
        }).show();



    }




}
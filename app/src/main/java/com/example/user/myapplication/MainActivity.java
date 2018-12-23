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
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);

        help = findViewById(R.id.help);

    }

    public void bmi(View view){
        Log.d("MainActivity" , "BMI");
        float weight = Float.parseFloat(edweight.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        float bmi = weight / height * height ;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI" , bmi);
        startActivity(intent);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity" , "help button");
                new AlertDialog.Builder(MainActivity.this).setMessage("HELPPP")
                        .setTitle("HELPP").setPositiveButton("OK" , null).show();
            }
        });

        Toast.makeText(this, "Your BMI is " + bmi , Toast.LENGTH_LONG).show();

        new AlertDialog.Builder(this).setMessage("Your BMI is " + bmi)
                .setTitle("BMI").setPositiveButton("OK ! " , null)
                .setNegativeButton("CLEAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edweight.setText("");
                        edheight.setText("");
                    }
                }).show();
    }
}

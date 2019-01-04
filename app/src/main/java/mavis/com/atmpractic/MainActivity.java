package mavis.com.atmpractic;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edheight;
    private EditText edweight;
    private Button edhelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edheight = findViewById(R.id.ed_height);
        edweight = findViewById(R.id.ed_weight);
        edhelp = findViewById(R.id.helpbutton);
    }

    public void bmi(View view){
        float height = Float.parseFloat(edheight.getText().toString());
        float weight = Float.parseFloat(edweight.getText().toString());
        float bmiresult = weight / (height/100 * height/100);

        //Intent New Activity
        Intent intent = new Intent(this , ResultActivity.class);
        intent.putExtra("BMI" , bmiresult);
        startActivity(intent);

        //Toast
        Toast.makeText(this, "Your BMI is " + bmiresult , Toast.LENGTH_LONG).show();

        //New AlertDialog
        new AlertDialog.Builder(this).setMessage("Your BMI is " + bmiresult)
                .setTitle("BMI").setPositiveButton("OK! " , null)
                .setNegativeButton("Clear", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edheight.setText("");
                        edweight.setText("");
                    }
                }).show();

        edhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setMessage("error?")
                        .setTitle("Help?").setPositiveButton("OK" , null).show();
            }
        });
    }
}

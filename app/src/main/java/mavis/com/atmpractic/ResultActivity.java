package mavis.com.atmpractic;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        float bmi = getIntent().getFloatExtra("BMI", 0 );
        TextView showresult = findViewById(R.id.show_result);
        showresult.setText(bmi + " ");
    }

}

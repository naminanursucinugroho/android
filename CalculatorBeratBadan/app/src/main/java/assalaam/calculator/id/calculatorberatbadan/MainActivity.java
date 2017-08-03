package assalaam.calculator.id.calculatorberatbadan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private float height;
    private float weight;
    private float BMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Hitung = (Button) findViewById(R.id.hitung);
        final EditText height_value= (EditText) findViewById(R.id.Height);
        final EditText weight_value= (EditText) findViewById(R.id.Height);
        final TextView result = (TextView) findViewById(R.id.Hasil);

        Hitung.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (height_value.getText().length()>0 && weight_value.getText().length()>0) {
                    height = Float.parseFloat(height_value.getText().toString());
                    weight = Float.parseFloat(weight_value.getText().toString());
                    BMI = KalkulatorPerhitungan(weight,height);

                    if(BMI < 16){
                        result.setText("Your BMI"+BMI+"Cungkring");
                    }else if (BMI< 16.5){
                        result.setText("Your BMI"+BMI+"peot");
                    }else if (BMI< 25){
                        result.setText("Your BMI"+BMI+"Normal");
                    }else if (BMI< 30){
                        result.setText("Your BMI"+BMI+"Rada Gendut");
                    }else {
                        result.setText("Your BMI"+BMI+"Obesitas");
                    }
                }
            }


        });

    }
    private float KalkulatorPerhitungan(float weight, float height) {
        height = (height/100);
        return (float) (weight/(height*height));
    }
}

package com.example.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.first.fuu ;



public class MainActivity extends AppCompatActivity {

    Button btn ;
    TextView tv1;
    EditText lend,rate,number;
    fuu fuu ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lend = (EditText) findViewById(R.id.input_lend);
        rate = (EditText) findViewById(R.id.input_rate);
        number = (EditText) findViewById(R.id.input_number);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double aa,bb,cc;
                aa = Double.parseDouble(lend.getText().toString());
                bb = Double.parseDouble(rate.getText().toString());
                cc = Double.parseDouble(number.getText().toString());
                fuu = new fuu();

                tv1.setText(""+fuu.f(aa,bb,cc));


            }
        });

    }//-----------------------------------------------------------------------------------------


//    private double f(double a, double b, double c){
//
//        double ans = a*(Math.pow((b+1.0),c));
//        //ans = 1*(Math.pow((3),3));
//        return ans;
//    }

}

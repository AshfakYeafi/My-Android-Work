package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1,et2;
    Button ad,sb,dv,mul;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);

        res=(TextView) findViewById(R.id.result);

        ad=(Button) findViewById(R.id.addition);
        sb=(Button) findViewById(R.id.sub);
        dv=(Button) findViewById(R.id.div);
        mul=(Button) findViewById(R.id.mul);

        ad.setOnClickListener(this);
        sb.setOnClickListener(this);
        dv.setOnClickListener(this);
        mul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {

            String num1=et1.getText().toString();
            String num2=et2.getText().toString();
            Double count=Double.valueOf(num1);
            Double temp=Double.valueOf(num2);
            if (v.getId()==R.id.addition){
                Double sum=count+temp;
                res.setText("Result: "+sum);
            }
            if (v.getId()==R.id.sub){
                Double min=count-temp;
                res.setText("Result : "+min);
            }
            if (v.getId()==R.id.div){
                Double di=count/temp;
                res.setText("Result : "+di);
            }
            if (v.getId()==R.id.mul){
                Double ml=count*temp;
                res.setText("Result : "+ml);

            }


        }
        catch (Exception e){
            Toast.makeText(MainActivity.this,"Enter any number",Toast.LENGTH_SHORT).show();
        }


    }
}
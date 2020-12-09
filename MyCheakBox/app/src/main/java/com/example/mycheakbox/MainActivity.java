package com.example.mycheakbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox cMilk,cWater,cOil;
    Button bShow;
    TextView tResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cMilk=(CheckBox) findViewById(R.id.milk);
        cWater=(CheckBox) findViewById(R.id.wter);
        cOil=(CheckBox) findViewById(R.id.oil);

        bShow=(Button) findViewById(R.id.button);

        tResult=(TextView) findViewById(R.id.result);

        bShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder stringBuilder=new StringBuilder();
        if (cMilk.isChecked()){
            String value=cMilk.getText().toString();
            stringBuilder.append(value+" is order"+"\n");
        }
        if (cWater.isChecked()){
            String value=cWater.getText().toString();
            stringBuilder.append(value+" is order"+"\n");
        }if (cOil.isChecked()){
            String value=cOil.getText().toString();
            stringBuilder.append(value+" is order"+"\n");
        }
        tResult.setText(stringBuilder);
    }
}
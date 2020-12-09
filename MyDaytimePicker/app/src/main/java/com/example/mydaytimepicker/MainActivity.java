package com.example.mydaytimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bSlect;
    TextView tCurrent;
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bSlect=(Button) findViewById(R.id.button);
        tCurrent=(TextView) findViewById(R.id.textDate);
        datePicker=(DatePicker) findViewById(R.id.date);
        tCurrent.setText(currentDate());
        bSlect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tCurrent.setText(currentDate());
            }
        });

    }
    String currentDate(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Current Date: ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();
    }
}
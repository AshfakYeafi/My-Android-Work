 package com.example.mydatedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bShow;
    TextView tRes;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bShow=(Button)findViewById(R.id.buttton);
        tRes=(TextView) findViewById(R.id.text_01);

        bShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DatePicker datePicker=new DatePicker(this);
        int date=datePicker.getDayOfMonth();
        int month=datePicker.getMonth();
        int year=datePicker.getYear();
        datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tRes.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            }
        },date,month,year


        );
        datePickerDialog.show();
    }
}
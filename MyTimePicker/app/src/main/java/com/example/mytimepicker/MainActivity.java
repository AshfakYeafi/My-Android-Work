package com.example.mytimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
        Button button;
        AlertDialog.Builder alertDialogBuilder;
        TimePickerDialog timePickerDialog;
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
        textView=(TextView) findViewById(R.id.text_time);

        button.setOnClickListener(this);

    }
    public void onBackPressed() {
        alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Alart");
        alertDialogBuilder.setMessage("Do You want to exit?");
        alertDialogBuilder.setPositiveButton("Yes", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
    public void onClick(View v) {
        TimePicker timePicker=new TimePicker(this);
        int current_hour=timePicker.getCurrentHour();
        int current_minute=timePicker.getMinute();
        timePickerDialog =new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String time;
                time=hourOfDay+":"+minute;
                textView.setText(time);
            }
        },current_hour,current_minute,false
        );
        timePickerDialog.show();

    }
}
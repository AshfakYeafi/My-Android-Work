package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rGroup;
    RadioButton maleBullon;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rGroup=(RadioGroup) findViewById(R.id.rGroup);

        button=(Button) findViewById(R.id.button);



        textView=(TextView) findViewById(R.id.result);

        button.setOnClickListener(this);



    }
    
    @Override
    public void onClick(View v) {
        int bId=rGroup.getCheckedRadioButtonId();
        maleBullon=(RadioButton)findViewById(bId);
        String value=maleBullon.getText().toString();
        textView.setText(value);
    }
}
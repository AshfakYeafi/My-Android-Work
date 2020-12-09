package com.example.myimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but=(Button) findViewById(R.id.button);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button)
        {
            LayoutInflater inflater=getLayoutInflater();
            View v=inflater.inflate(R.layout.custom_tost,(ViewGroup) findViewById(R.id.custom_layout));
            Toast tost=new Toast(MainActivity.this);
            tost.setDuration(Toast.LENGTH_SHORT);
            tost.setGravity(Gravity.CENTER,0,0);
            tost.setView(v);
            tost.show();

        }

    }
}
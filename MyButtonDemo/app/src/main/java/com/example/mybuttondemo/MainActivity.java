package com.example.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView newTextView;
    private Button newButton1,newButton2;
    int c1=0,c2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newButton1=(Button) findViewById(R.id.button1);
        newButton2=(Button) findViewById(R.id.button2);
        newTextView=(TextView) findViewById(R.id.textview);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button1){
            c1++;
            Toast.makeText(MainActivity.this,"Fuck You",Toast.LENGTH_LONG).show();
            Log.d("tag","Login clicked");

        }
        if (view.getId()==R.id.button2){
            c2++;
            newTextView.setText("Logout button is clicked "+c2+ " times");
        }
    }
}
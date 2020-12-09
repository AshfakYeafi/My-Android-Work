package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int result;
    private Button bOne,bTwo,bThree,bFour,bFive,bSix,bSeven,bEight,bNine,bZero,bPlus,bMinus,bAns;
    private TextView display,sine;
    private String count="0",temp="0";
    int ans1,ans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sine=(TextView) findViewById(R.id.sine);
        display=(TextView) findViewById(R.id.display);

        bOne=(Button) findViewById(R.id.one);
        bTwo=(Button) findViewById(R.id.two);
        bThree=(Button) findViewById(R.id.three);
        bFour=(Button) findViewById(R.id.four);
        bFive=(Button) findViewById(R.id.five);
        bSix=(Button) findViewById(R.id.six);
        bSeven=(Button) findViewById(R.id.seven);
        bEight=(Button) findViewById(R.id.eight);
        bNine=(Button) findViewById(R.id.nine);
        bZero=(Button) findViewById(R.id.zero);
        bPlus=(Button) findViewById(R.id.plus);
        bMinus=(Button) findViewById(R.id.minus);
        bAns=(Button) findViewById(R.id.ans);

        bOne.setOnClickListener(this);
        bTwo.setOnClickListener(this);
        bThree.setOnClickListener(this);
        bFour.setOnClickListener(this);
        bFive.setOnClickListener(this);
        bSix.setOnClickListener(this);
        bSeven.setOnClickListener(this);
        bEight.setOnClickListener(this);
        bNine.setOnClickListener(this);
        bZero.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bAns.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.one){
            count+="1";
            display.setText(count);
        }
        if(v.getId()==R.id.two){
            count+="2";
            display.setText(count);

        }
        if(v.getId()==R.id.three){
            count+="3";
            display.setText(count);

        }
        if(v.getId()==R.id.four){
            count+="4";
            display.setText(count);

        }
        if(v.getId()==R.id.five){
            count+="5";
            display.setText(count);

        }
        if(v.getId()==R.id.six){
            count+="6";
            display.setText(count);

        }
        if(v.getId()==R.id.seven){
            count+="7";
            display.setText(count);

        }
        if(v.getId()==R.id.eight){
            count+="8";
            display.setText(count);

        }
        if(v.getId()==R.id.nine){
            count+="9";
            display.setText(count);

        }
        if(v.getId()==R.id.zero){
            count+="0";
            display.setText(count);

        }
        else {
            ans1=Integer.valueOf(count);
            if (v.getId() == R.id.plus) {
                sine.setText("+");
                result+=ans1;
                display.setText(String.valueOf(result));
                count = "0";


            }
            if (v.getId() == R.id.minus) {
                sine.setText("-");
                result = Integer.valueOf(count) - Integer.valueOf(temp);
                display.setText(String.valueOf(result));
                temp = count;
                count = "0";
            }
            if (v.getId() == R.id.ans) {
                sine.setText("-----");
                display.setText("                  ");
                String count = "0";
                result=0;
            }
        }

    }

//    public static int convert(String s){
//        return parseInt(s);
//    }
//
//    public static int add(String a, String b){
//        int c=convert(a);
//        int d=convert(b);
//        return c+d;
//    }
//    public int substrat(int a, int b){
//        return a-b;
//
//    }
}
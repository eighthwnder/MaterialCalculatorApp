package com.example.mazik.materialcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CharSequence thenum2;
    CharSequence value1;
    CharSequence value2;
    CharSequence result;
    Boolean addition=false;
    Boolean substraction=false;
    Boolean multiplication=false;
    Boolean division=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zero_press(View view){

        TextView dsp = (TextView)findViewById(R.id.display);
       dsp.setText(dsp.getText()+"0");


    }

    public void one_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"1");


    }

    public void two_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"2");


    }

    public void three_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"3");


    }

    public void four_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"4");


    }

    public void five_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"5");


    }

    public void six_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"6");


    }

    public void seven_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"7");


    }

    public void eight_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"8");


    }

    public void nine_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        dsp.setText(dsp.getText()+"9");


    }

    public void add_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        TextView tdsp = (TextView)findViewById(R.id.top_display);
        value1=dsp.getText();

        tdsp.setText(dsp.getText()+"+");
        dsp.setText("");
        addition=true;

    }

    public void sub_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        TextView tdsp = (TextView)findViewById(R.id.top_display);
        tdsp.setText(dsp.getText()+"-");
        value1=dsp.getText();
        dsp.setText("");
        substraction=true;

    }

    public void mult_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        TextView tdsp = (TextView)findViewById(R.id.top_display);
        tdsp.setText(dsp.getText()+"x");
        value1=dsp.getText();
        dsp.setText("");
        multiplication=true;

    }

    public void div_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        TextView tdsp = (TextView)findViewById(R.id.top_display);
        tdsp.setText(dsp.getText()+"/");
        value1=dsp.getText();
        dsp.setText("");
        division=true;

    }
    public void del_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        TextView tdsp = (TextView)findViewById(R.id.top_display);
        dsp.setText("");
        tdsp.setText("");

    }

    public void ans_press(View view){
        TextView dsp = (TextView)findViewById(R.id.display);
        TextView tdsp = (TextView)findViewById(R.id.top_display);

        thenum2 = dsp.getText();
        int result;
        int number1= Integer.parseInt(value1.toString());
        int number2=Integer.parseInt(thenum2.toString());


        if(addition==true){
            tdsp.setText(value1.toString()+"+"+dsp.getText());
            result=number1+number2;
            dsp.setText(Integer.toString(result));
            addition=false;

        }else if(substraction==true){
            tdsp.setText(value1.toString()+"-"+dsp.getText());
            result=number1-number2;
            dsp.setText(Integer.toString(result));
            substraction=false;

        }else if(multiplication==true){
            tdsp.setText(value1.toString()+"x"+dsp.getText());
            result=number1*number2;
            dsp.setText(Integer.toString(result));
            multiplication=false;

        }else if(division==true){
            tdsp.setText(value1.toString()+"/"+dsp.getText());
            result=number1/number2;
            dsp.setText(Integer.toString(result));
            division=false;
        }















}
}

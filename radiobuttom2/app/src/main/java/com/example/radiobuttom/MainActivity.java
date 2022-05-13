package com.example.radiobuttom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private TextView tv1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =(EditText) findViewById(R.id.et1);
        num2 = (EditText) findViewById(R.id.et2);
        rb1 = (RadioButton) findViewById(R.id.rbsumar);
        rb2 = (RadioButton)  findViewById(R.id.rbrestar);
        rb3 = (RadioButton)  findViewById(R.id.rbmultiplicar);
        rb4 = (RadioButton)  findViewById(R.id.rbdividir);
        tv1 = (TextView)  findViewById(R.id.tv1);


    }


    public void calcular (View view) {

        String et1_string = num1.getText().toString();
        String et2_string = num2.getText().toString();

        int et1_int = Integer.parseInt(et1_string);
        int et2_int = Integer.parseInt(et2_string);

        if(rb1.isChecked()== true){
          int suma = et1_int + et2_int;
          String resultado =

        }

    }












}
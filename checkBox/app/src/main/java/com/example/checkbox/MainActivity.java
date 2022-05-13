package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creamos los atributos de la clase

    private EditText et1;
    private EditText et2;
    private CheckBox cb1;
    private CheckBox cb2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.et1); // traemos los valores desde el XML
        et2 = (EditText) findViewById(R.id.et2);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        tv1 = (TextView) findViewById(R.id.tv1);

    }


    public void calcular ( View view){

        String v1_string = et1.getText().toString(); // traemos los valores desde la clase oncreate
        String v2_string = et2.getText().toString();


        int v1_int = Integer.parseInt(v1_string); // transformamos los valores a enteros
        int v2_int = Integer.parseInt(v2_string);

        String resultado = ""; // inicializamos la variable sin nada


        if (cb1.isChecked() == true){

            int suma = v1_int + v2_int;

            resultado = " El resultado de la suma es : " + suma;

        }
        if ( cb2.isChecked()== true){

            int resta = v1_int - v2_int;
            resultado = resultado + " El resultado de la resta es : " + resta;

        }

        tv1.setText(resultado);


    }



    public void carcular2 (View view){

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty()){

            Toast.makeText(this,"Ingrese los datos porfavor no sea :", Toast.LENGTH_LONG).show();

        }else {
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());

                  int suma = num1 + num2;
                  int resta = num1 + num2;

               if (cb1.isChecked() && cb2.isChecked()) {

                   tv1.setText("la suma es : " +suma + "/" + "La resta es : " + resta );


               }else if (cb2.isChecked()){

                   tv1.setText("La resta es . " +resta + "/");

               } else if (cb1.isChecked()){

                   tv1.setText(" la suma es : " +suma + "/");

               }
               else {

                   Toast.makeText(this,"Selecciona alguna opcion porfavor ",Toast.LENGTH_LONG).show();
               }


        }






    }












}
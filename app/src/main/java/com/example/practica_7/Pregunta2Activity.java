package com.example.practica_7;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Pregunta2Activity extends Activity implements View.OnClickListener {

    Button siguiente, anterior;
    Boolean seleccionC = false, seleccionPython = false, seleccionJS = false, seleccionJava = false;
    private CheckBox opcionC, opcionJS, opcionPython, opcionJava;
    int resultadoPregunta;
    String resultP1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta2_layout);

        siguiente = findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(this);
        anterior = findViewById(R.id.botonAnterior);
        anterior.setOnClickListener(this);

        opcionC = findViewById(R.id.checkC);
        opcionPython = findViewById(R.id.checkPython);
        opcionJava = findViewById(R.id.checkJava);
        opcionJS = findViewById(R.id.checkJS);

        Intent intent = getIntent();
        resultP1 = intent.getStringExtra("resultadoP1");
    }

    @Override
    public void onClick(View view) {
        comprobarCheckbox(view);
        switch (view.getId()){
            case R.id.botonSiguiente:
                if (resultadoPregunta == 0 || resultadoPregunta == 1){
                    Intent lanzarP3 = new Intent(this, Pregunta3Activity.class);
                    startActivity(lanzarP3);
                } else{
                    Toast toast = Toast.makeText(this, "Por favor, responde antes de continuar", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;

            case R.id.botonAnterior:
                Intent volverP1 = new Intent(this, Pregunta1Activity.class);
                startActivity(volverP1);
                break;
        }
    }

    public void comprobarCheckbox(View view){
        Boolean checkedC = opcionC.isChecked();
        Boolean checkedPython = opcionPython.isChecked();
        Boolean checkedJava = opcionJava.isChecked();
        Boolean checkedJS = opcionJS.isChecked();

        switch (view.getId()){
            case R.id.checkC:
                if (checkedC.booleanValue()){
                    seleccionC = true;
                    Log.d(TAG, "comprobarCheckbox: " + seleccionC);
                }else{
                    seleccionC = false;
                }
                break;
            case R.id.checkPython:
                if (checkedPython){
                    seleccionPython = true;
                }else{
                    seleccionPython = false;
                }
                break;
            case R.id.checkJava:
                if (checkedJava){
                    seleccionJava = true;
                }else{
                    seleccionJava = false;
                }
                break;
            case R.id.checkJS:
                if (checkedJS){
                    seleccionJS = true;
                }else{
                    seleccionJS = false;
                }
                break;
        }

        comprobarRespuesta();
    }

    public int comprobarRespuesta(){
        if (seleccionC && seleccionJava){
            resultadoPregunta = 1;
        } else{
            resultadoPregunta = 0;
        }
        return resultadoPregunta;
    }
}

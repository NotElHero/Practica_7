package com.example.practica_7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pregunta1Activity extends Activity implements View.OnClickListener {

    Button siguiente;
    int resultadoPregunta = 0;
    RadioGroup radioOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1_layout);

        siguiente = findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(this);

        radioOpciones = findViewById(R.id.radioGroup2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonSiguiente:
                comprobarRespuesta();
                if (resultadoPregunta == -1 || resultadoPregunta == 1){
                    Intent lanzarP2 = new Intent(getApplicationContext(), Pregunta2Activity.class);
                    lanzarP2.putExtra("resultadoP1", resultadoPregunta);
                    startActivity(lanzarP2);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Responde a la pregunta antes de continuar", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
        }
    }

    public int comprobarRespuesta(){
        resultadoPregunta = radioOpciones.getCheckedRadioButtonId();
        if (resultadoPregunta == R.id.radioGoogle){
            resultadoPregunta = 1;
        }
        if (resultadoPregunta == R.id.radioApple){
            resultadoPregunta = -1;
        }
        if (resultadoPregunta == R.id.radioJetbrains){
            resultadoPregunta = -1;
        }
        if (resultadoPregunta == R.id.radioHuawei){
            resultadoPregunta = -1;
        }
        return resultadoPregunta;
    }

}

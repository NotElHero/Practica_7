package com.example.practica_7;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CuestionarioActivity extends Activity implements View.OnClickListener {

    RadioButton radioGoogle, radioApple, radioJetbrains, radioHuawei;
    Button siguiente, verResultados, anterior;
    ArrayList<Integer> preguntasArray = new ArrayList<>();
    int pregunta = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1_layout);

        radioGoogle = findViewById(R.id.radioButton3);
        radioApple = findViewById(R.id.radioButton4);
        radioJetbrains = findViewById(R.id.radioButton5);
        radioHuawei = findViewById(R.id.radioButton6);

        preguntasArray.add(R.layout.pregunta1_layout);
        preguntasArray.add(R.layout.pregunta2_layout);

        siguiente = findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(this);
        anterior = findViewById(R.id.botonAnterior);
        anterior.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonSiguiente:
                pregunta++;
                if (pregunta > 5){
                    pregunta = 5;
                }
                Log.d(TAG, "Valor pregunta: "+pregunta);
                cambiarPregunta(pregunta);
                break;

            case R.id.botonAnterior:
                pregunta--;
                if (pregunta < 1){
                    Intent volverInicio = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(volverInicio);
                }
                Log.d(TAG, "Valor pregunta: "+pregunta);

                cambiarPregunta(pregunta);
                break;
        }
    }

    public void cambiarPregunta(int pregunta){
        switch (pregunta){
            case 1:
                setContentView(preguntasArray.get(0));
                break;
            case 2:
                setContentView(preguntasArray.get(1));
                break;
        }
    }
}

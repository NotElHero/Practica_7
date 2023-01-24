package com.example.practica_7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CuestionarioActivity extends Activity implements View.OnClickListener {

    RadioButton radioGoogle, radioApple, radioJetbrains, radioHuawei;
    Button siguiente, verResultados, anterior;
    ArrayList<Integer> preguntasArray = new ArrayList<>();

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
        int pregunta = 1;

        switch (view.getId()){
            case R.id.botonSiguiente:
                pregunta++;
                if (pregunta > 5){
                    pregunta = 5;
                }

                cambiarPregunta(pregunta);
                break;

            case R.id.botonAnterior:
                pregunta--;
                if (pregunta < 1){
                    pregunta = 1;
                }

                cambiarPregunta(pregunta);
                break;
        }
    }

    public int cambiarPregunta(int pregunta){
        switch (pregunta){
            case 1:
                setContentView(preguntasArray.get(0));
                break;
            case 2:
                setContentView(preguntasArray.get(1));
                break;
        }
        return pregunta;
    }
}

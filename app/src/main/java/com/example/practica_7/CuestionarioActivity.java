package com.example.practica_7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.annotation.Nullable;

public class CuestionarioActivity extends Activity implements View.OnClickListener {

    RadioButton radioGoogle, radioApple, radioJetbrains, radioHuawei;
    Button siguiente, verResultados;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1_layout);

        radioGoogle = findViewById(R.id.radioButton3);
        radioApple = findViewById(R.id.radioButton4);
        radioJetbrains = findViewById(R.id.radioButton5);
        radioHuawei = findViewById(R.id.radioButton6);

        siguiente = findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}

package com.example.practica_7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Pregunta4Activity extends Activity implements View.OnClickListener {

    RadioButton radioGoogle, radioApple, radioJetbrains, radioHuawei;
    Button siguiente, anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta4_layout);

        radioGoogle = findViewById(R.id.radioGoogle);
        radioApple = findViewById(R.id.radioApple);
        radioJetbrains = findViewById(R.id.radioJetbrains);
        radioHuawei = findViewById(R.id.radioHuawei);

        siguiente = findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(this);
        anterior = findViewById(R.id.botonAnterior);
        anterior.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonSiguiente:
                Intent lanzarP5 = new Intent(this, Pregunta5Activity.class);
                startActivity(lanzarP5);
                break;

            case R.id.botonAnterior:
                Intent volverP3 = new Intent(this, Pregunta3Activity.class);
                startActivity(volverP3);
                break;
        }
    }

}

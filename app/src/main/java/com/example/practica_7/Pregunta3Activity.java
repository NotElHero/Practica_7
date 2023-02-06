package com.example.practica_7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Pregunta3Activity extends Activity implements View.OnClickListener {

    RadioButton radioGoogle, radioApple, radioJetbrains, radioHuawei;
    Button siguiente, anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta3_layout);

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
                Intent lanzarP4 = new Intent(this, Pregunta4Activity.class);
                startActivity(lanzarP4);
                break;

            case R.id.botonAnterior:
                Intent volverP2 = new Intent(this, Pregunta2Activity.class);
                startActivity(volverP2);
                break;
        }
    }

}

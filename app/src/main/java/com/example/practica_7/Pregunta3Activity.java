package com.example.practica_7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Pregunta3Activity extends Activity implements View.OnClickListener {

    Button siguiente, anterior;
    EditText editRespuesta;
    String respuestaP3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta3_layout);

        siguiente = findViewById(R.id.botonSiguiente);
        siguiente.setOnClickListener(this);
        anterior = findViewById(R.id.botonAnterior);
        anterior.setOnClickListener(this);

        editRespuesta = findViewById(R.id.editRespuesta);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonSiguiente:
                if (editRespuesta.getText().toString() == "C"){
                    respuestaP3 = "1";
                } else {
                    respuestaP3 = "0";
                }
                Intent lanzarP4 = new Intent(this, Pregunta4Activity.class);
                lanzarP4.putExtra("RESPUESTAP3", respuestaP3);
                startActivity(lanzarP4);
                break;

            case R.id.botonAnterior:
                Intent volverP2 = new Intent(this, Pregunta2Activity.class);
                startActivity(volverP2);
                break;
        }
    }

}

package com.example.practica_7;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton sobre10, sobre100;
    Button botonEmpezar;
    EditText textNombre;
    boolean isSobre10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEmpezar = findViewById(R.id.botonEmpezar);
        botonEmpezar.setOnClickListener(this);

        sobre10 = findViewById(R.id.sobre10);
        sobre100 = findViewById(R.id.sobre100);

        textNombre = findViewById(R.id.editTextNombre);

        isSobre10 = false;


    }

    @Override
    public void onClick(View view) {
        if (textNombre.getText().toString() == null || textNombre.getText().toString().equals("")){
            Toast adv1 = Toast.makeText(this, "Escribe tu nombre antes de comenzar", Toast.LENGTH_SHORT);
            adv1.show();
        }else{
            Log.d(TAG, textNombre.getText().toString());
            if (sobre10.isChecked()){
                isSobre10 = true;
                Intent lanzarCuestionario = new Intent(this, CuestionarioActivity.class);
                startActivity(lanzarCuestionario);
            }

            if (sobre100.isChecked()){
                isSobre10 = false;
                Intent lanzarCuestionario = new Intent(this, CuestionarioActivity.class);
                startActivity(lanzarCuestionario);
            }

            if (!sobre10.isChecked() && !sobre100.isChecked()){
                Toast adv2 = Toast.makeText(this, "Selecciona un metodo de puntuacion antes de comenzar", Toast.LENGTH_SHORT);
                adv2.show();
            }
        }
    }

}
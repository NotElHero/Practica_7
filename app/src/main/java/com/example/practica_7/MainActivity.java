package com.example.practica_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup selecciones;
    RadioButton sobre10, sobre100;
    Button botonEmpezar;
    EditText textNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEmpezar = findViewById(R.id.botonEmpezar);
        botonEmpezar.setOnClickListener(this);

        textNombre = findViewById(R.id.editTextNombre);
    }

    @Override
    public void onClick(View view) {
        if (textNombre == null){
            Toast adv1 = Toast.makeText(this, "Escribe tu nombre antes de comenzar", Toast.LENGTH_SHORT);
            adv1.show();
        }
       
    }

}
package com.example.ejercicio12_jorgeasfurapadilla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre_main, txtapellidos_main, txtedad_main, txtcorreo_main;
    Button btnenviar_main;
    String nombre, apellidos, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre_main = findViewById(R.id.txtnombre_main);
        txtapellidos_main = findViewById(R.id.txtapellidos_main);
        txtedad_main = findViewById(R.id.txtedad_main);
        txtcorreo_main = findViewById(R.id.txtcorreo_main);
        btnenviar_main = findViewById(R.id.btnenviar_main);


        btnenviar_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nombre = txtnombre_main.getText().toString();
                apellidos = txtapellidos_main.getText().toString();
                edad = txtedad_main.getText().toString();
                correo = txtcorreo_main.getText().toString();


                Intent intentSend = new Intent(getApplicationContext(), ActivityInfo.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("nombre", nombre);
                bundleDates.putString("apellidos", apellidos);
                bundleDates.putString("edad", edad);
                bundleDates.putString("correo", correo);

                intentSend.putExtras(bundleDates);
                startActivity(intentSend);
            }
        });
    }
}
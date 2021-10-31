package com.example.ejercicio12_jorgeasfurapadilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {

    String nombre, apellidos, edad, correo;
    TextView txtnombre_info, txtapellidos_info, txtedad_info, txtcorreo_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Bundle bundleDates = getIntent().getExtras();
        nombre = bundleDates.getString("nombre");
        apellidos = bundleDates.getString("apellidos");
        edad = bundleDates.getString("edad");
        correo = bundleDates.getString("correo");

        txtnombre_info = findViewById(R.id.txtnombre_info);
        txtapellidos_info = findViewById(R.id.txtapellidos_info);
        txtedad_info = findViewById(R.id.txtedad_info);
        txtcorreo_info = findViewById(R.id.txtcorreo_info);

        txtnombre_info.setText(nombre);
        txtapellidos_info.setText(apellidos);
        txtedad_info.setText(edad);
        txtcorreo_info.setText(correo);
    }
}
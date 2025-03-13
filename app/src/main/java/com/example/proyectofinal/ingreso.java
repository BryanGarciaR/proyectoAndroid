package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ingreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ingreso);
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));

        // Obtener referencia al botón "Ingresar"
        Button btnIngresar = findViewById(R.id.btnIngresar);
        // Obtener referencia al texto "Registrate"
        TextView txtRegistrarse = findViewById(R.id.txtRegistrarse);

        // Listener para el texto "Registrate"
        txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ingreso.this, registro.class);
                startActivity(intent);
            }
        });

        // Listener para el botón "Ingresar"
        btnIngresar.setOnClickListener(v -> {
            Intent intent = new Intent(ingreso.this, Principal.class);
            startActivity(intent);
        });
    }
}
